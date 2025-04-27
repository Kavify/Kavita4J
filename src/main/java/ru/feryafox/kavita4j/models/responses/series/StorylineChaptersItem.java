package ru.feryafox.kavita4j.models.responses.series;

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
class StorylineChaptersItem extends BaseKavitaResponseModel {

	@SerializedName("genresLocked")
	private boolean genresLocked;

	@SerializedName("locationLocked")
	private boolean locationLocked;

	@SerializedName("publicationStatus")
	private int publicationStatus;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("language")
	private String language;

	@SerializedName("maxHoursToRead")
	private int maxHoursToRead;

	@SerializedName("characterLocked")
	private boolean characterLocked;

	@SerializedName("colorists")
	private List<ColoristsItem> colorists;

	@SerializedName("lettererLocked")
	private boolean lettererLocked;

	@SerializedName("minNumber")
	private int minNumber;

	@SerializedName("pages")
	private int pages;

	@SerializedName("isSpecial")
	private boolean isSpecial;

	@SerializedName("lastReadingProgress")
	private String lastReadingProgress;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("publishers")
	private List<PublishersItem> publishers;

	@SerializedName("id")
	private int id;

	@SerializedName("translatorLocked")
	private boolean translatorLocked;

	@SerializedName("wordCount")
	private int wordCount;

	@SerializedName("teams")
	private List<TeamsItem> teams;

	@SerializedName("coverArtistLocked")
	private boolean coverArtistLocked;

	@SerializedName("created")
	private String created;

	@SerializedName("count")
	private int count;

	@SerializedName("ageRating")
	private int ageRating;

	@SerializedName("inkers")
	private List<InkersItem> inkers;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("titleName")
	private String titleName;

	@SerializedName("inkerLocked")
	private boolean inkerLocked;

	@SerializedName("tagsLocked")
	private boolean tagsLocked;

	@SerializedName("sortOrder")
	private int sortOrder;

	@SerializedName("imprintLocked")
	private boolean imprintLocked;

	@SerializedName("writerLocked")
	private boolean writerLocked;

	@SerializedName("files")
	private List<FilesItem> files;

	@SerializedName("pencillers")
	private List<PencillersItem> pencillers;

	@SerializedName("createdUtc")
	private String createdUtc;

	@SerializedName("letterers")
	private List<LetterersItem> letterers;

	@SerializedName("publisherLocked")
	private boolean publisherLocked;

	@SerializedName("pagesRead")
	private int pagesRead;

	@SerializedName("releaseYearLocked")
	private boolean releaseYearLocked;

	@SerializedName("isbn")
	private String isbn;

	@SerializedName("range")
	private String range;

	@SerializedName("avgHoursToRead")
	private int avgHoursToRead;

	@SerializedName("title")
	private String title;

	@SerializedName("totalCount")
	private int totalCount;

	@SerializedName("minHoursToRead")
	private int minHoursToRead;

	@SerializedName("characters")
	private List<CharactersItem> characters;

	@SerializedName("maxNumber")
	private int maxNumber;

	@SerializedName("translators")
	private List<TranslatorsItem> translators;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("publicationStatusLocked")
	private boolean publicationStatusLocked;

	@SerializedName("volumeId")
	private int volumeId;

	@SerializedName("webLinks")
	private String webLinks;

	@SerializedName("coloristLocked")
	private boolean coloristLocked;

	@SerializedName("lastReadingProgressUtc")
	private String lastReadingProgressUtc;

	@SerializedName("coverArtists")
	private List<CoverArtistsItem> coverArtists;

	@SerializedName("teamLocked")
	private boolean teamLocked;

	@SerializedName("editors")
	private List<EditorsItem> editors;

	@SerializedName("summary")
	private String summary;

	@SerializedName("volumeTitle")
	private String volumeTitle;

	@SerializedName("summaryLocked")
	private boolean summaryLocked;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("editorLocked")
	private boolean editorLocked;

	@SerializedName("pencillerLocked")
	private boolean pencillerLocked;

	@SerializedName("coverImageLocked")
	private boolean coverImageLocked;

	@SerializedName("writers")
	private List<WritersItem> writers;

	@SerializedName("ageRatingLocked")
	private boolean ageRatingLocked;

	@SerializedName("lastModifiedUtc")
	private String lastModifiedUtc;

	@SerializedName("imprints")
	private List<ImprintsItem> imprints;

	@SerializedName("languageLocked")
	private boolean languageLocked;

	@SerializedName("locations")
	private List<LocationsItem> locations;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}