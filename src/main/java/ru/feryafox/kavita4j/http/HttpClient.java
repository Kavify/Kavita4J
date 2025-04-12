package ru.feryafox.kavita4j.http;

import com.google.gson.Gson;
import okhttp3.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.requests.account.Login;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.account.User;

import java.io.IOException;
import java.util.Arrays;
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

    private <T extends BaseKavitaResponseModel> HttpClientResponse<T> call(Request request, Class<T> clazz) {
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                if (clazz == NoneResponse.class) {
                    @SuppressWarnings("unchecked")
                    T noneInstance = (T) NoneResponse.create();
                    return HttpClientResponse.from(response, noneInstance);
                }
                return HttpClientResponse.from(
                        response,
                        gson.fromJson(response.body().string(), clazz)
                );
            } else {
                return HttpClientResponse.from(
                        response,
                        response.body().string()
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
