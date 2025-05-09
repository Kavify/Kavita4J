package ru.feryafox.kavita4j.http;

import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.RawResponse;

import java.util.Map;

public interface BaseAuthHttpClient extends BaseHttpClient {
    <T extends BaseKavitaResponseModel> HttpClientResponse<T> getAuth(Class<T> clazz, RequestOptions options, String... pathSegments);
    <T extends BaseKavitaResponseModel> HttpClientResponse<T> postAuth(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments);
    <T extends BaseKavitaResponseModel> HttpClientResponse<T> deleteAuth(Class<T> clazz, RequestOptions options, String... pathSegments);
    BinaryResponse getBinaryAuth(RequestOptions requestOptions, String... pathSegments);

    HttpClientResponse<RawResponse> getAuthRaw(RequestOptions requestOptions, String... pathSegments);
    HttpClientResponse<RawResponse> postAuthRaw(BaseKavitaRequestModel requestModel, RequestOptions requestOptions, String... pathSegments);
    HttpClientResponse<RawResponse> deleteAuthRaw(RequestOptions requestOptions, String... pathSegments);

    default <T extends BaseKavitaResponseModel> HttpClientResponse<T> getAuth(Class<T> clazz, String... pathSegments) {
        return getAuth(clazz, new RequestOptions(), pathSegments);
    }

    default <T extends BaseKavitaResponseModel> HttpClientResponse<T> postAuth(Class<T> clazz, BaseKavitaRequestModel requestModel, String... pathSegments) {
        return postAuth(clazz, requestModel, new RequestOptions(), pathSegments);
    }

    default <T extends BaseKavitaResponseModel> HttpClientResponse<T> deleteAuth(Class<T> clazz, String... pathSegments) {
        return deleteAuth(clazz, new RequestOptions(), pathSegments);
    }

    default HttpClientResponse<RawResponse> getAuthRaw(String... pathSegments) {
        return getAuthRaw(new RequestOptions(), pathSegments);
    }

    default HttpClientResponse<RawResponse> postAuthRaw(BaseKavitaRequestModel requestModel, String... pathSegments) {
        return postAuthRaw(requestModel, new RequestOptions(), pathSegments);
    }

    default HttpClientResponse<RawResponse> deleteAuthRaw(String... pathSegments) {
        return deleteAuthRaw(new RequestOptions(), pathSegments);
    }

    default BinaryResponse getBinaryAuth(String... pathSegments) {
        return getBinaryAuth(new RequestOptions(), pathSegments);
    }
}
