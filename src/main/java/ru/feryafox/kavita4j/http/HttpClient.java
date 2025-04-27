package ru.feryafox.kavita4j.http;

import com.google.gson.Gson;
import okhttp3.*;
import ru.feryafox.kavita4j.models.JsonArrayHolder;
import ru.feryafox.kavita4j.models.JsonValueHolder;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.requests.account.Login;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.RawResponse;
import ru.feryafox.kavita4j.models.responses.account.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HttpClient implements BaseHttpClient {
    private HttpUrl url;
    private final OkHttpClient client;
    private final Gson gson;
    private String accessToken;

    public HttpClient(String baseUrl) {
        url = createUrl(baseUrl);
        client = createClient();
        gson = new Gson();
    }

    private HttpUrl createUrl(String baseUr) {
        return HttpUrl.parse(baseUr);
    }

    @Override
    public void setBaseUrl(String baseUrl) {
        url = createUrl(baseUrl);
    }

    @Override
    public String getBaseUrl() {
        return url.toString();
    }

    private OkHttpClient createClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request();

                    if (accessToken != null && !accessToken.isEmpty()) {
                        Request requestWithAuth = request.newBuilder()
                                .addHeader("Authorization", "Bearer " + accessToken).build();
                        return chain.proceed(requestWithAuth);
                    }
                    return chain.proceed(request);
                })
                .build();
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions requestOptions, String... pathSegments) {
        String json = gson.toJson(requestModel);

        RequestBody requestBody = RequestBody.create(json, MediaType.parse("application/json"));

        Request.Builder requestBuilder = new Request.Builder()
                .url(createUrl(requestOptions, pathSegments))
                .post(requestBody);

        if (requestOptions != null && requestOptions.getHeaders() != null) {
            requestOptions.getHeaders().forEach(requestBuilder::addHeader);
        }

        return call(requestBuilder.build(), clazz);
    }

    @Override
    public HttpClientResponse<RawResponse> postRaw(BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments) {
        return post(RawResponse.class, requestModel, options, pathSegments);
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> delete(Class<T> clazz, RequestOptions options, String... pathSegments) {
        Request.Builder requestBuilder = new Request.Builder()
                .url(createUrl(options, pathSegments))
                .delete();

        if (options != null && options.getHeaders() != null) {
            options.getHeaders().forEach(requestBuilder::addHeader);
        }

        return call(requestBuilder.build(), clazz);
    }

    @Override
    public HttpClientResponse<RawResponse> deleteRaw(RequestOptions options, String... pathSegments) {
        return delete(RawResponse.class, options, pathSegments);
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, RequestOptions requestOptions, String... pathSegments) {
        Request.Builder requestBuilder = new Request.Builder()
                .url(createUrl(requestOptions, pathSegments))
                .get();

        if (requestOptions != null && requestOptions.getHeaders() != null) {
            requestOptions.getHeaders().forEach(requestBuilder::addHeader);
        }

        return call(requestBuilder.build(), clazz);
    }

    @Override
    public HttpClientResponse<RawResponse> getRaw(RequestOptions options, String... pathSegments) {
        return get(RawResponse.class, options, pathSegments);
    }

    @Override
    public BinaryResponse getBinary(RequestOptions requestOptions, String... pathSegments) {
        Request.Builder requestBuilder = new Request.Builder()
                .url(createUrl(requestOptions, pathSegments))
                .get();

        if (requestOptions != null && requestOptions.getHeaders() != null) {
            requestOptions.getHeaders().forEach(requestBuilder::addHeader);
        }

        Request request = requestBuilder.build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Failed to download binary: " + response);
            }

            ResponseBody body = response.body();
            byte[] bytes = body != null ? body.bytes() : null;

            return BinaryResponse.builder()
                            .data(bytes).build();
        } catch (IOException e) {
            throw new RuntimeException("Download error", e);
        }
    }

    private <T extends BaseKavitaResponseModel> HttpClientResponse<T> call(Request request,
                                                                           Class<T> clazz) {
        try (Response response = client.newCall(request).execute()) {

            if (!response.isSuccessful()) {
                return HttpClientResponse.from(response, response.body().string());
            }

            String body = response.body().string();
            System.out.println(body);

            if (JsonArrayHolder.class.isAssignableFrom(clazz)) {
                java.lang.reflect.Type elemType = findGenericArgument(clazz, JsonArrayHolder.class);

                java.lang.reflect.Type listType =
                        com.google.gson.reflect.TypeToken
                                .getParameterized(java.util.List.class, elemType)
                                .getType();

                java.util.List<?> list = gson.fromJson(body, listType);

                @SuppressWarnings("unchecked")
                T container = clazz.getDeclaredConstructor().newInstance();

                ((JsonArrayHolder) container).setItems(list);

                return HttpClientResponse.from(response, container);
            }

            if (JsonValueHolder.class.isAssignableFrom(clazz)) {
                java.lang.reflect.Type valType = findGenericArgument(clazz, JsonValueHolder.class);

                Object value = gson.fromJson(body, valType);

                @SuppressWarnings("unchecked")
                T container = clazz.getDeclaredConstructor().newInstance();

                ((JsonValueHolder) container).setValue(value);

                return HttpClientResponse.from(response, container);
            }

            if (clazz == NoneResponse.class) {
                @SuppressWarnings("unchecked")
                T none = (T) NoneResponse.create();
                return HttpClientResponse.from(response, none);
            }
            if (clazz == RawResponse.class) {
                @SuppressWarnings("unchecked")
                T raw = (T) new RawResponse(body);
                return HttpClientResponse.from(response, raw);
            }

            return HttpClientResponse.from(response, gson.fromJson(body, clazz));

        } catch (IOException | ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static java.lang.reflect.Type findGenericArgument(Class<?> target,
                                                              Class<?> expectedRaw) {
        for (java.lang.reflect.Type t : target.getGenericInterfaces()) {
            if (t instanceof java.lang.reflect.ParameterizedType pt &&
                    pt.getRawType() == expectedRaw) {
                return pt.getActualTypeArguments()[0];
            }
        }

        Class<?> superCls = target.getSuperclass();
        if (superCls != null) {
            return findGenericArgument(superCls, expectedRaw);
        }
        throw new IllegalStateException("Generic argument not found for " + target);
    }

    private String createUrl(RequestOptions requestOptions, String... pathSegments) {
        var builder = url.newBuilder();
        Arrays.stream(pathSegments).forEach(builder::addPathSegment);

        if (requestOptions != null && requestOptions.getQueryParams() != null) {
            requestOptions.getQueryParams().forEach(builder::addQueryParameter);
        }

        return builder.build().toString();
    }

}
