package ru.feryafox.kavita4j.components;

import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.http.RequestOptions;
import ru.feryafox.kavita4j.models.requests.NoneRequest;
import ru.feryafox.kavita4j.models.requests.series.*;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.series.*;
import ru.feryafox.kavita4j.models.responses.series.SeriesMetadata;

import java.util.Arrays;
import java.util.List;
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
                "all-v2"
        );
    }

    public HttpClientResponse<SeriesList> onDeck(
            int pageNumber,
            int pageSize,
            int libraryId
    ) {
        return client.postAuth(
                SeriesList.class,
                NoneRequest.create(),
                RequestOptions.builder()
                        .addQueryParam("PageNumber", String.valueOf(pageNumber))
                        .addQueryParam("PageSize", String.valueOf(pageSize))
                        .addQueryParam("libraryId", String.valueOf(libraryId))
                        .build(),
                "api",
                "Series",
                "on-deck"
        );
    }

    public HttpClientResponse<NoneResponse> removeFromOnDeck(
            int seriesId
    ) {
        return client.postAuth(
                NoneResponse.class,
                NoneRequest.create(),
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "remove-from-on-deck"
        );
    }

    public HttpClientResponse<NoneResponse> refreshMetadata(
            int libraryId,
            int seriesId,
            boolean forceUpdate,
            boolean forceColorscape
    ) {
        return client.postAuth(
                NoneResponse.class,
                RefreshSeries.builder()
                        .libraryId(libraryId)
                        .seriesId(seriesId)
                        .forceUpdate(forceUpdate)
                        .forceColorscape(forceColorscape)
                        .build(),
                "api",
                "Series",
                "refresh-metadata"
        );
    }

    public HttpClientResponse<NoneResponse> scan(
            int libraryId,
            int seriesId,
            boolean forceUpdate,
            boolean forceColorscape
    ) {
        return client.postAuth(
                NoneResponse.class,
                RefreshSeries.builder()
                        .libraryId(libraryId)
                        .seriesId(seriesId)
                        .forceUpdate(forceUpdate)
                        .forceColorscape(forceColorscape)
                        .build(),
                "api",
                "Series",
                "scan"
        );
    }

    public HttpClientResponse<NoneResponse> analyze(
            int libraryId,
            int seriesId,
            boolean forceUpdate,
            boolean forceColorscape
    ) {
        return client.postAuth(
                NoneResponse.class,
                RefreshSeries.builder()
                        .libraryId(libraryId)
                        .seriesId(seriesId)
                        .forceUpdate(forceUpdate)
                        .forceColorscape(forceColorscape)
                        .build(),
                "api",
                "Series",
                "analyze"
        );
    }

    public HttpClientResponse<SeriesMetadata> getMetadata(
            int seriesId
    ) {
        return client.getAuth(
                SeriesMetadata.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "metadata"
        );
    }

    public HttpClientResponse<NoneResponse> updateMetadata(
            UpdateSeriesMetadata updateSeriesMetadata
    ) {
        return client.postAuth(
                NoneResponse.class,
                updateSeriesMetadata,
                "api",
                "Series",
                "metadata"
        );
    }

    public HttpClientResponse<SeriesList> getSeriesByCollection(
            int collectionId,
            int pageNumber,
            int pageSize
    ) {
        return client.getAuth(
                SeriesList.class,
                RequestOptions.builder()
                        .addQueryParam("PageNumber", String.valueOf(pageNumber))
                        .addQueryParam("PageSize", String.valueOf(pageSize))
                        .addQueryParam("collectionId", String.valueOf(collectionId))
                        .build(),
                "api",
                "Series",
                "by-collection"
        );
    }

    public HttpClientResponse<SeriesList> getSeriesByIds(
            List<Integer> seriesIds
    ) {
        return client.postAuth(
                SeriesList.class,
                SeriesByIds.builder()
                        .seriesIds(seriesIds)
                        .build(),
                "api",
                "Series",
                "series-by-ids"
        );
    }

    public HttpClientResponse<AgeRating> getAgeRating(
            int ageRating
    ) {
        return client.getAuth(
                AgeRating.class,
                RequestOptions.builder()
                        .addQueryParam("ageRating", String.valueOf(ageRating))
                        .build(),
                "api",
                "Series",
                "age-rating"
        );
    }

    public HttpClientResponse<SeriesDetail> getSeriesDetail(
            int seriesId
    ) {
        return client.getAuth(
                SeriesDetail.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "detail"
        );
    }

    public HttpClientResponse<SeriesList> getRelated(
            int seriesId,
            int relation
    ) {
        return client.getAuth(
                SeriesList.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .addQueryParam("relation", String.valueOf(relation))
                        .build(),
                "api",
                "Series",
                "related"
        );
    }

    public HttpClientResponse<SeriesList> getAllRelated(
            int seriesId
    ) {
        return client.getAuth(
                SeriesList.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "all-related"
        );
    }

    public HttpClientResponse<NoneResponse> updateSeriesRelated(
            UpdateRelatedSeries updateSeriesRelation
    ) {
        return client.postAuth(
                NoneResponse.class,
                updateSeriesRelation,
                "api",
                "Series",
                "update-related"
        );
    }

    public HttpClientResponse<ExternalSeries> getExternalSeriesDetail(
            int aniListId,
            int malId,
            int seriesId
    ) {
        return client.getAuth(
                ExternalSeries.class,
                RequestOptions.builder()
                        .addQueryParam("aniListId", String.valueOf(aniListId))
                        .addQueryParam("malId", String.valueOf(malId))
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "external-series-detail"
        );
    }

    public HttpClientResponse<NextExpectedChapter> getNextExpected(
            int seriesId
    ) {
        return client.getAuth(
                NextExpectedChapter.class,
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .build(),
                "api",
                "Series",
                "next-expected"
        );
    }

    public HttpClientResponse<ExternalSeriesMatch> match(
            MatchSeries matchSeries
    ) {
        return client.postAuth(
                ExternalSeriesMatch.class,
                matchSeries,
                "api",
                "Series",
                "match"
        );
    }

    public HttpClientResponse<NoneResponse> updateMatch(
            int seriesId,
            int aniListId,
            int malId,
            int cbrId
    ) {
        return client.postAuth(
                NoneResponse.class,
                NoneRequest.create(),
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .addQueryParam("aniListId", String.valueOf(aniListId))
                        .addQueryParam("malId", String.valueOf(malId))
                        .addQueryParam("cbrId", String.valueOf(cbrId))
                        .build(),
                "api",
                "Series",
                "update-match"
        );
    }

    public HttpClientResponse<NoneResponse> dontMatch(
            int seriesId,
            boolean dontMatch
    ) {
        return client.postAuth(
                NoneResponse.class,
                NoneRequest.create(),
                RequestOptions.builder()
                        .addQueryParam("seriesId", String.valueOf(seriesId))
                        .addQueryParam("dontMatch", String.valueOf(dontMatch))
                        .build(),
                "api",
                "Series",
                "dont-match"
        );
    }
}
