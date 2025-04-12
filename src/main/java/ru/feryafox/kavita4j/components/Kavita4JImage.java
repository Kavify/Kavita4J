package ru.feryafox.kavita4j.components;

import okhttp3.HttpUrl;
import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.BaseHttpClient;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.responses.BinaryResponse;
import ru.feryafox.kavita4j.models.responses.UrlResponse;

public class Kavita4JImage {
    private final Kavita4JAuth client;

    public Kavita4JImage(Kavita4JAuth client) {
        this.client = client;
    }

    public UrlResponse chapterCoverLink(int chapterId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("chapter-cover")
                        .addQueryParameter("chapterId", String.valueOf(chapterId)).build()
        );
    }

    public BinaryResponse chapterCover(int chapterId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "chapter-cover"
        );
    }

    public UrlResponse libraryCoverLink(int libraryId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("library-cover")
                        .addQueryParameter("libraryId", String.valueOf(libraryId)).build()
        );
    }

    public BinaryResponse libraryCover(int libraryId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("libraryId", String.valueOf(libraryId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "library-cover"
        );
    }

    public UrlResponse volumeCoverLink(int volumeId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("volume-cover")
                        .addQueryParameter("volumeId", String.valueOf(volumeId)).build()
        );
    }

    public BinaryResponse volumeCover(int volumeId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("volumeId", String.valueOf(volumeId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "volume-cover"
        );
    }

    public UrlResponse seriesCoverLink(int seriesId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("series-cover")
                        .addQueryParameter("seriesId", String.valueOf(seriesId)).build()
        );
    }

    public BinaryResponse seriesCover(int seriesId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "series-cover"
        );
    }

    public UrlResponse collectionCoverLink(int collectionId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("collection-cover")
                        .addQueryParameter("collectionId", String.valueOf(collectionId)).build()
        );
    }

    public BinaryResponse collectionCover(int collectionId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("collectionId", String.valueOf(collectionId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "collection-cover"
        );
    }

    public UrlResponse readinglistCoverLink(int readingListId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("readinglist-cover")
                        .addQueryParameter("readingListId", String.valueOf(readingListId)).build()
        );
    }

    public BinaryResponse readinglistCover(int readingListId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("readingListId", String.valueOf(readingListId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "readinglist-cover"
        );
    }

    public UrlResponse bookmarkLink(int chapterId, int pageNum) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("bookmark")
                        .addQueryParameter("chapterId", String.valueOf(chapterId))
                        .addQueryParameter("pageNum", String.valueOf(pageNum)).build()
        );
    }

    public BinaryResponse bookmark(int chapterId, int pageNum) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .addQueryParam("pageNum", String.valueOf(pageNum))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "bookmark"
        );
    }

    public UrlResponse webLink(String url) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("web-link")
                        .addQueryParameter("url", url).build()
        );
    }

    public BinaryResponse web(String url) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("url", url)
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "web-link"
        );
    }

    public UrlResponse publisherLink(String publisherName) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("publisher")
                        .addQueryParameter("publisherName", publisherName).build()
        );
    }

    public BinaryResponse publisher(String publisherName) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("publisherName", publisherName)
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "publisher"
        );
    }

    public UrlResponse personCoverLink(int personId) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("person-cover")
                        .addQueryParameter("personId", String.valueOf(personId)).build()
        );
    }

    public BinaryResponse personCover(int personId) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("personId", String.valueOf(personId))
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "person-cover"
        );
    }

    public UrlResponse personCoverByNameLink(String name) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("person-cover-by-name")
                        .addQueryParameter("name", name).build()
        );
    }

    public BinaryResponse personCoverByName(String name) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("name", name)
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "person-cover-by-name"
        );
    }

    public UrlResponse coverUploadLink(String filename) {
        return UrlResponse.from(
                baseUrlBuilder()
                        .addPathSegment("cover-upload")
                        .addQueryParameter("filename", filename).build()
        );
    }

    public BinaryResponse coverUpload(String filename) {
        return client.getBinary(
                RequestOptions.builder()
                        .addQueryParam("filename", filename)
                        .addQueryParam("apiKey", client.getApiKey())
                        .build(),
                "api",
                "Image",
                "cover-upload"
        );
    }

    private HttpUrl.Builder baseUrlBuilder() {
        return HttpUrl.parse(client.getBaseUrl()).newBuilder()
                .addPathSegment("api")
                .addPathSegment("Image")
                .addQueryParameter("apiKey", client.getApiKey());
    }
}
