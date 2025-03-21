package ru.feryafox.kavita4j.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import ru.feryafox.kavita4j.models.BaseKavitaModel;

public class HttpClient {
    private String baseUrl;
    private HttpUrl url;
    private OkHttpClient client;
    private ObjectMapper objectMapper;

    public HttpClient(String baseUrl) {
        this.baseUrl = baseUrl;
        url = HttpUrl.parse(baseUrl);
        client = new OkHttpClient();
        objectMapper = new ObjectMapper();
    }

    public <T> T post(Class<T> clazz, BaseKavitaModel requestModel, String[]... pathSegments) {
        Request request = new Request.Builder()
                .url(baseUrl + url)
                .build()
    }

    private
}
