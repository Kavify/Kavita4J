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
class SeriesMetadata extends BaseKavitaResponseModel {

	@SerializedName("genresLocked")
	private boolean genresLocked;

	@SerializedName("publisherLocked")
	private boolean publisherLocked;

	@SerializedName("locationLocked")
	private boolean locationLocked;

	@SerializedName("publicationStatus")
	private int publicationStatus;

	@SerializedName("releaseYearLocked")
	private boolean releaseYearLocked;

	@SerializedName("language")
	private String language;

	@SerializedName("totalCount")
	private int totalCount;

	@SerializedName("maxCount")
	private int maxCount;

	@SerializedName("characterLocked")
	private boolean characterLocked;

	@SerializedName("seriesId")
	private int seriesId;

	@SerializedName("colorists")
	private List<ColoristsItem> colorists;

	@SerializedName("lettererLocked")
	private boolean lettererLocked;

	@SerializedName("characters")
	private List<CharactersItem> characters;

	@SerializedName("translators")
	private List<TranslatorsItem> translators;

	@SerializedName("genres")
	private List<GenresItem> genres;

	@SerializedName("publicationStatusLocked")
	private boolean publicationStatusLocked;

	@SerializedName("publishers")
	private List<PublishersItem> publishers;

	@SerializedName("webLinks")
	private String webLinks;

	@SerializedName("coloristLocked")
	private boolean coloristLocked;

	@SerializedName("id")
	private int id;

	@SerializedName("coverArtists")
	private List<CoverArtistsItem> coverArtists;

	@SerializedName("teamLocked")
	private boolean teamLocked;

	@SerializedName("releaseYear")
	private int releaseYear;

	@SerializedName("editors")
	private List<EditorsItem> editors;

	@SerializedName("summary")
	private String summary;

	@SerializedName("summaryLocked")
	private boolean summaryLocked;

	@SerializedName("translatorLocked")
	private boolean translatorLocked;

	@SerializedName("teams")
	private List<TeamsItem> teams;

	@SerializedName("coverArtistLocked")
	private boolean coverArtistLocked;

	@SerializedName("editorLocked")
	private boolean editorLocked;

	@SerializedName("pencillerLocked")
	private boolean pencillerLocked;

	@SerializedName("writers")
	private List<WritersItem> writers;

	@SerializedName("ageRating")
	private int ageRating;

	@SerializedName("inkers")
	private List<InkersItem> inkers;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("ageRatingLocked")
	private boolean ageRatingLocked;

	@SerializedName("imprints")
	private List<ImprintsItem> imprints;

	@SerializedName("inkerLocked")
	private boolean inkerLocked;

	@SerializedName("languageLocked")
	private boolean languageLocked;

	@SerializedName("tagsLocked")
	private boolean tagsLocked;

	@SerializedName("imprintLocked")
	private boolean imprintLocked;

	@SerializedName("writerLocked")
	private boolean writerLocked;

	@SerializedName("locations")
	private List<LocationsItem> locations;

	@SerializedName("pencillers")
	private List<PencillersItem> pencillers;

	@SerializedName("letterers")
	private List<LetterersItem> letterers;
}