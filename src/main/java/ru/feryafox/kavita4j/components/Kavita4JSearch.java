package ru.feryafox.kavita4j.components;

import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.responses.search.SearchResultGroup;

public class Kavita4JSearch {
    private final BaseAuthHttpClient client;

    public Kavita4JSearch(BaseAuthHttpClient client) {
        this.client = client;
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
