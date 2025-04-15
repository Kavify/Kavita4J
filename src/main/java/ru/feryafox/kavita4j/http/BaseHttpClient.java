package ru.feryafox.kavita4j.http;

import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.RawResponse;

public interface BaseHttpClient {
     void setBaseUrl(String baseUrl);
     String getBaseUrl();
     <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, RequestOptions options, String... pathSegments);
     HttpClientResponse<RawResponse> getRaw(RequestOptions options, String... pathSegments);
     <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments);
     HttpClientResponse<RawResponse> postRaw(BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments);

     BinaryResponse getBinary(RequestOptions options, String... pathSegments);

     default <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, String... pathSegments) {
          return get(clazz, new RequestOptions(), pathSegments);
     }

     default <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, String... pathSegments) {
          return post(clazz, requestModel, new RequestOptions(), pathSegments);
     }

     default HttpClientResponse<RawResponse> getRaw(String... pathSegments) {
          return getRaw(new RequestOptions(), pathSegments);
     }

     default HttpClientResponse<RawResponse> postRaw(BaseKavitaRequestModel requestModel, String... pathSegments) {
          return postRaw(requestModel, new RequestOptions(), pathSegments);
     }

     default BinaryResponse getBinary(String... pathSegments) {
            return getBinary(new RequestOptions(), pathSegments);
     }
}
