package ru.feryafox.kavita4j.models.responses.search;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public
class SearchResultGroup extends BaseKavitaResponseModel {

	@SerializedName("bookmarks")
	private List<BookmarksItem> bookmarks;

	@SerializedName("persons")
	private List<PersonsItem> persons;

	@SerializedName("collections")
	private List<CollectionsItem> collections;

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	@SerializedName("series")
	private List<SeriesItem> series;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("libraries")
	private List<LibrariesItem> libraries;

	@SerializedName("readingLists")
	private List<ReadingListsItem> readingLists;

	@SerializedName("files")
	private List<FilesItem> files;

	@SerializedName("tags")
	private List<TagsItem> tags;
}