package ru.feryafox.kavita4j.models.requests.download;


import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Series extends BaseKavitaRequestModel {
	private boolean hasUserRated;
	private String libraryName;
	private String sortName;
	private int pagesRead;
	private String latestReadDate;
	private String lastFolderScanned;
	private int libraryId;
	private String primaryColor;
	private int maxHoursToRead;
	private int avgHoursToRead;
	private String originalName;
	private String folderPath;
	private int minHoursToRead;
	private int pages;
	private String coverImage;
	private boolean nameLocked;
	private int id;
	private boolean dontMatch;
	private boolean sortNameLocked;
	private String lowestFolderPath;
	private String localizedName;
	private int wordCount;
	private String created;
	private String lastChapterAdded;
	private int format;
	private boolean coverImageLocked;
	private boolean localizedNameLocked;
	private int userRating;
	private boolean isBlacklisted;
	private String name;
	private String secondaryColor;
}
