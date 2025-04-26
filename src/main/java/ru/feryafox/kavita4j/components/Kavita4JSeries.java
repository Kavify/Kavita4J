package ru.feryafox.kavita4j.components;

import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.requests.series.DeleteMultiple;
import ru.feryafox.kavita4j.models.requests.series.FilterV2;
import ru.feryafox.kavita4j.models.requests.series.UpdateRating;
import ru.feryafox.kavita4j.models.requests.series.UpdateSeries;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.series.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kavita4JSeries {
    private final BaseAuthHttpClient client;

    public Kavita4JSeries(BaseAuthHttpClient client) {
        this.client = client;
    }

    public HttpClientResponse<Series> seriesV2(
            int pageNumber,
            int pageSize,
            FilterV2 filterV2
    ) {
        return client.postAuth(
                Series.class,
                filterV2,
                RequestOptions.builder()
                        .addQueryParam("PageNumber", String.valueOf(pageNumber))
                        .addQueryParam("PageSize", String.valueOf(pageSize))
                        .build(),
                "api",
                "Series",
                "v2"
        );

    }

    public HttpClientResponse<Series> seriesV2(FilterV2 filterV2) {
        return client.postAuth(
                Series.class,
                filterV2,
                "api",
                "Series",
                "v2"
        );

    }

    public HttpClientResponse<Series> getSeries(int seriesId) {
        return client.getAuth(
                Series.class,
                "api",
                "Series",
                String.valueOf(seriesId)
        );
    }

    public HttpClientResponse<IsSuccessfulDeleted> deleteSeries(int seriesId) {
        return client.deleteAuth(
                IsSuccessfulDeleted.class,
                "api",
                "Series",
                String.valueOf(seriesId)
        );
    }

    public HttpClientResponse<NoneResponse> deleteMultiple(int[] seriesIds) {
        return client.postAuth(
                NoneResponse.class,
                DeleteMultiple.builder()
                        .seriesIds(Arrays.stream(seriesIds)
                                .boxed()
                                .collect(Collectors.toList()))
                        .build(),
                "api",
                "Series",
                "delete-multiple"
        );
    }


    public HttpClientResponse<Volumes> getVolumes(int seriesId) {
        return client.getAuth(
                Volumes.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "volumes"
        );
    }

    public HttpClientResponse<Volume> getVolume(int volumeId) {
        return client.getAuth(
                Volume.class,
                RequestOptions.builder()
                        .addQueryParam("volumeId", String.valueOf(volumeId))
                        .build(),
                "api",
                "Series",
                "volume"
        );
    }

    public HttpClientResponse<Chapter> getChapter(int chapterId) {
        return client.getAuth(
                Chapter.class,
                RequestOptions.builder()
                        .addQueryParam("chapterId", String.valueOf(chapterId))
                        .build(),
                "api",
                "Series",
                "chapter"
        );
    }

    public HttpClientResponse<NoneResponse> updateRating(
            int seriesId,
            int userRating
    ) {
        return client.postAuth(
                NoneResponse.class,
                UpdateRating.builder()
                        .seriesId(seriesId)
                        .userRating(userRating)
                        .build(),
                "api",
                "Series",
                "update-rating"
        );
    }

    public HttpClientResponse<NoneResponse> updateSeries(
            UpdateSeries updateSeries
    ) {
        return client.postAuth(
                NoneResponse.class,
                updateSeries,
                "api",
                "Series",
                "update"
        );
    }

    public HttpClientResponse<SeriesList> recentlyAddedV2(
            int pageNumber,
            int pageSize,
            FilterV2 filterV2
    ) {
        return client.postAuth(
                SeriesList.class,
                filterV2,
                RequestOptions.builder()
                        .addQueryParam("PageNumber", String.valueOf(pageNumber))
                        .addQueryParam("PageSize", String.valueOf(pageSize))
                        .build(),
                "api",
                "Series",
                "recently-added-v2"
        );
    }

    public HttpClientResponse<RecentlyAddedItems> recentlyUpdateSeries() {
        return client.getAuth(
                RecentlyAddedItems.class,
                "api",
                "Series",
                "recently-updated-series"
        );
    }

    public HttpClientResponse<SeriesList> getAllV2(
            int pageNumber,
            int pageSize,
            int libraryId,
            int context,
            FilterV2 filterV2
    ) {
        return client.postAuth(
                SeriesList.class,
                filterV2,
                RequestOptions.builder()
                        .addQueryParam("PageNumber", String.valueOf(pageNumber))
                        .addQueryParam("PageSize", String.valueOf(pageSize))
                        .addQueryParam("libraryId", String.valueOf(libraryId))
                        .addQueryParam("context", String.valueOf(context))
                        .build(),
                "api",
                "Series",
                "v2"
        );
    }
}
