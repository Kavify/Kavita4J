package ru.feryafox.kavita4j.http;

import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

public interface BaseHttpClient {
     void setBaseUrl(String baseUrl);
     <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, RequestOptions options, String... pathSegments);
     <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments);

     default <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, String... pathSegments) {
          return get(clazz, new RequestOptions(), pathSegments);
     }

     default <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, String... pathSegments) {
          return post(clazz, requestModel, new RequestOptions(), pathSegments);
     }
}
