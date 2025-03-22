package ru.feryafox.kavita4j.http;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import okhttp3.Response;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@Builder
@Getter
@Accessors(fluent = true)
@ToString
public class HttpClientResponse <T extends BaseKavitaResponseModel> {
    private Integer statusCode;
    private T responseModel = null;
    private String errorMessage = null;

    public boolean isSuccess() {
        return statusCode >= 200 && statusCode < 300;
    }

    private HttpClientResponse(Integer statusCode, T responseModel) {
        this.statusCode = statusCode;
        this.responseModel = responseModel;
    }

    private HttpClientResponse(Integer statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }

    private HttpClientResponse(Integer statusCode, T responseModel, String errorMessage) {
        this.statusCode = statusCode;
        this.responseModel = responseModel;
        this.errorMessage = errorMessage;
    }

    public static <T extends BaseKavitaResponseModel> HttpClientResponse<T> from(Response response, T responseModel) {
        return new HttpClientResponse<>(response.code(), responseModel);
    }
    public static <T extends BaseKavitaResponseModel> HttpClientResponse<T> from(Response response, String errorMessage) {
        return new HttpClientResponse<>(response.code(), errorMessage);
    }
}
