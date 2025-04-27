package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public
class SeriesMetadata extends BaseKavitaRequestModel {
	private boolean genresLocked;
	private boolean publisherLocked;
	private boolean locationLocked;
	private int publicationStatus;
	private boolean releaseYearLocked;
	private String language;
	private int totalCount;
	private int maxCount;
	private boolean characterLocked;
	private int seriesId;
	private List<ColoristsItem> colorists;
	private boolean lettererLocked;
	private List<CharactersItem> characters;
	private List<TranslatorsItem> translators;
	private List<GenresItem> genres;
	private boolean publicationStatusLocked;
	private List<PublishersItem> publishers;
	private String webLinks;
	private boolean coloristLocked;
	private int id;
	private List<CoverArtistsItem> coverArtists;
	private boolean teamLocked;
	private int releaseYear;
	private List<EditorsItem> editors;
	private String summary;
	private boolean summaryLocked;
	private boolean translatorLocked;
	private List<TeamsItem> teams;
	private boolean coverArtistLocked;
	private boolean editorLocked;
	private boolean pencillerLocked;
	private List<WritersItem> writers;
	private int ageRating;
	private List<InkersItem> inkers;
	private List<TagsItem> tags;
	private boolean ageRatingLocked;
	private List<ImprintsItem> imprints;
	private boolean inkerLocked;
	private boolean languageLocked;
	private boolean tagsLocked;
	private boolean imprintLocked;
	private boolean writerLocked;
	private List<LocationsItem> locations;
	private List<PencillersItem> pencillers;
	private List<LetterersItem> letterers;
}