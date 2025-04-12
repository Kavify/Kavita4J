package ru.feryafox.kavita4j.models.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import okhttp3.HttpUrl;

@Getter
@Builder
@ToString
public class UrlResponse {
    private String url;

    public static final UrlResponse from(HttpUrl url) {
        return UrlResponse.builder()
                .url(url.toString())
                .build();
    }
}
