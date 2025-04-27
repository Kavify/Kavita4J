package ru.feryafox.kavita4j.components;

import okhttp3.HttpUrl;
import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.http.utils.UrlBuilderUtils;
import ru.feryafox.kavita4j.models.requests.download.DownloadBookmark;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.UrlResponse;
import ru.feryafox.kavita4j.models.responses.download.Size;

public class Kavita4JDownload {
    private BaseAuthHttpClient client;

    public Kavita4JDownload(BaseAuthHttpClient client) {
        this.client = client;
    }

    public HttpClientResponse<Size> volumeSize(int volumeId) {
        return client.getAuth(
                Size.class,
                RequestOptions.builder()
                        .addQueryParam("volumeId", String.valueOf(volumeId))
                        .build(),
                "api",
                "Download",
                "volume-size"
        );
    }

    public HttpClientResponse<Size> chapterSize(int chapterId) {
        return client.getAuth(
                Size.class,
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .build(),
                "api",
                "Download",
                "chapter-size"
        );
    }

    public HttpClientResponse<Size> seriesSize(int seriesId) {
        return client.getAuth(
                Size.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Download",
                "series-size"
        );
    }

    public UrlResponse volumeLink(int volumeId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("volume")
                        .addQueryParameter("volumeId", String.valueOf(volumeId)).build()
        );
    }

    public BinaryResponse volume(int volumeId) {
        return client.getBinaryAuth(
                RequestOptions.builder()
                        .addQueryParam("volumeId", String.valueOf(volumeId))
                        .build(),
                "api",
                "Download",
                "volume"
        );
    }

    public UrlResponse chapterLink(int chapterId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("chapter")
                        .addQueryParameter("chapterId", String.valueOf(chapterId)).build()
        );
    }

    public BinaryResponse chapter(int chapterId) {
        return client.getBinaryAuth(
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .build(),
                "api",
                "Download",
                "chapter"
        );
    }

    public UrlResponse seriesLink(int seriesId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("series")
                        .addQueryParameter("seriesId", String.valueOf(seriesId)).build()
        );
    }

    public BinaryResponse series(int seriesId) {
        return client.getBinaryAuth(
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Download",
                "series"
        );
    }

    public BinaryResponse bookmarks(DownloadBookmark bookmark) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private HttpUrl.Builder baseUrlBuilder() {
        return UrlBuilderUtils.baseUrlBuilder(
                client.getBaseUrl(),
                "Download"
        );
    }
}
