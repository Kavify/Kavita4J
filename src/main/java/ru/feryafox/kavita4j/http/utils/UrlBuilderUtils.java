package ru.feryafox.kavita4j.http.utils;

import okhttp3.HttpUrl;

public class UrlBuilderUtils {
    public static HttpUrl.Builder baseUrlBuilder(
            String baseUrl,
            String type,
            String apiKey
    ) {
        return HttpUrl.parse(baseUrl).newBuilder()
                .addPathSegment("api")
                .addPathSegment(type)
                .addQueryParameter("apiKey", apiKey);
    }

    public static HttpUrl.Builder baseUrlBuilder(
            String baseUrl,
            String type
    ) {
        return HttpUrl.parse(baseUrl).newBuilder()
                .addPathSegment("api")
                .addPathSegment(type);
    }
}
