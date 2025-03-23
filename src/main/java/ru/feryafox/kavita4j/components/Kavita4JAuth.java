package ru.feryafox.kavita4j.components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.feryafox.kavita4j.exceptions.account.IncorrectCredentialsException;
import ru.feryafox.kavita4j.exceptions.account.InvalidTokenException;
import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.BaseHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;
import ru.feryafox.kavita4j.models.requests.account.Login;
import ru.feryafox.kavita4j.models.requests.account.ResetPassword;
import ru.feryafox.kavita4j.models.requests.account.TokenRequest;
import ru.feryafox.kavita4j.models.requests.account.Register;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.account.TokenResponse;
import ru.feryafox.kavita4j.models.responses.account.User;

import java.util.Map;

public class Kavita4JAuth implements BaseAuthHttpClient {
    private final BaseHttpClient client;
    private String username;
    private String password;
    private String apiKey;
    private String accessToken;
    private String refreshToken;

    public Kavita4JAuth(BaseHttpClient client) {
        this.client = client;
    }

    public void loadCredentials(Kavita4JAuthCredentials credentials) {
        username = credentials.getUsername();
        password = credentials.getPassword();
        apiKey = credentials.getApiKey();
        accessToken = credentials.getAccessToken();
        refreshToken = credentials.getRefreshToken();
    }

    public HttpClientResponse<User> login(String username, String password) {
        return login(username, password, null);
    }

    public HttpClientResponse<User> login(String apiKey) {
        return login(null, null, apiKey);
    }

    public HttpClientResponse<User> login(String username, String password, String apiKey) {
        var response = client.post(
                User.class,
                Login.builder()
                        .username(username)
                        .password(password)
                        .apiKey(apiKey)
                        .build(),
                "api",
                "Account",
                "login"
        );

        if (response.statusCode() == 401) throw new IncorrectCredentialsException();

        this.username = username;
        this.password = password;
        this.apiKey = response.responseModel().getApiKey();
        this.accessToken = response.responseModel().getToken();
        this.refreshToken = response.responseModel().getRefreshToken();

        return response;
    }

    public HttpClientResponse<TokenResponse> refreshToken() {
        var response = client.post(
                TokenResponse.class,
                TokenRequest.builder()
                        .token(accessToken)
                        .refreshToken(refreshToken)
                        .build(),
                "api",
                "Account",
                "refresh-token"
        );

        if (response.statusCode() == 401) throw new InvalidTokenException();

        accessToken = response.responseModel().getToken();
        refreshToken = response.responseModel().getRefreshToken();

        return response;
    }

    public HttpClientResponse<User> register(String username, String email, String password) {
        var response = client.post(
                User.class,
                Register.builder()
                        .username(username)
                        .email(email)
                        .password(password)
                        .build(),
                "api",
                "Account",
                "register"
        );

        this.username = username;
        this.password = password;
        this.accessToken = response.responseModel().getToken();
        this.refreshToken = response.responseModel().getRefreshToken();
        this.apiKey = response.responseModel().getApiKey();

        return response;
    }

    public HttpClientResponse<NoneResponse> resetPassword(String username, String password, String oldPassword) {
        var response = client.post(
                NoneResponse.class,
                ResetPassword.builder()
                        .userName(username)
                        .password(password)
                        .oldPassword(oldPassword)
                        .build(),
                "api",
                "Account",
                "reset-password"
        );

        this.username = username;
        this.password = password;

        return response;
    }

    public Kavita4JAuthCredentials getCredentials() {
        return new Kavita4JAuthCredentials(username, password, apiKey, accessToken, refreshToken);
    }

    @Override
    public void setBaseUrl(String baseUrl) {
         client.setBaseUrl(baseUrl);
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> get(Class<T> clazz, RequestOptions options, String... pathSegments) {
        return client.get(clazz, options, pathSegments);
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> post(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments) {
        return client.post(clazz, requestModel, options, pathSegments);
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> getAuth(Class<T> clazz, RequestOptions options, String... pathSegments) {
        var optionsWithAuthHeader = addAuthHeader(options);
        var response = client.get(clazz, optionsWithAuthHeader, pathSegments);

        // TODO узнать, какой код ошибки при просроченном токене
        if (response.statusCode() == 401) {
            refreshToken();
            return client.get(clazz, optionsWithAuthHeader, pathSegments);
        }

        return response;
    }

    @Override
    public <T extends BaseKavitaResponseModel> HttpClientResponse<T> postAuth(Class<T> clazz, BaseKavitaRequestModel requestModel, RequestOptions options, String... pathSegments) {
        var optionsWithAuthHeader = addAuthHeader(options);
        var response = client.post(clazz, requestModel, optionsWithAuthHeader, pathSegments);

        // TODO узнать, какой код ошибки при просроченном токене
        if (response.statusCode() == 401) {
            refreshToken();
            return client.post(clazz, requestModel, optionsWithAuthHeader, pathSegments);
        }

        return response;
    }

    private RequestOptions addAuthHeader(RequestOptions options) {
        var cloneOptions = options.clone();
        cloneOptions.getHeaders().put("Authorization", "Bearer " + accessToken);
        return cloneOptions;
    }

    @AllArgsConstructor
    @Getter
    public static class Kavita4JAuthCredentials {
       private String username;
       private String password;
       private String apiKey;
       private String accessToken;
       private String refreshToken;
    }
}
