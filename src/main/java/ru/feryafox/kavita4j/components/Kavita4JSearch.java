package ru.feryafox.kavita4j.components;

import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.responses.search.SearchResultGroup;
import ru.feryafox.kavita4j.models.responses.search.Series;

public class Kavita4JSearch {
    private final BaseAuthHttpClient client;

    public Kavita4JSearch(BaseAuthHttpClient client) {
        this.client = client;
    }

    public HttpClientResponse<Series> seriesForMangafile(int mangaFileId) {
        return client.getAuth(
                Series.class,
                RequestOptions.builder()
                        .addQueryParam("mangaFileId", String.valueOf(mangaFileId))
                        .build(),
                "api",
                "Search",
                "series-for-mangafile"
        );
    }

    public HttpClientResponse<Series> seriesForChapter(int chapterId) {
        return client.getAuth(
                Series.class,
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .build(),
                "api",
                "Search",
                "series-for-chapter"
        );
    }

    public HttpClientResponse<SearchResultGroup> search(String query, boolean includeChapterAndFiles) {
        return client.getAuth(
                SearchResultGroup.class,
                RequestOptions.builder()
                        .addQueryParam("queryString", query)
                        .addQueryParam("includeChapterAndFiles", String.valueOf(includeChapterAndFiles))
                        .build(),
                "api",
                "Search",
                "search"
        );
    }
}
