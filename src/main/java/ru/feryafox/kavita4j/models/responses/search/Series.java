package ru.feryafox.kavita4j.models.responses.search;

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
public class Series extends BaseKavitaResponseModel {

	@SerializedName("hasUserRated")
	private boolean hasUserRated;

	@SerializedName("libraryName")
	private String libraryName;

	@SerializedName("sortName")
	private String sortName;

	@SerializedName("pagesRead")
	private int pagesRead;

	@SerializedName("latestReadDate")
	private String latestReadDate;

	@SerializedName("lastFolderScanned")
	private String lastFolderScanned;

	@SerializedName("libraryId")
	private int libraryId;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("maxHoursToRead")
	private int maxHoursToRead;

	@SerializedName("avgHoursToRead")
	private int avgHoursToRead;

	@SerializedName("originalName")
	private String originalName;

	@SerializedName("folderPath")
	private String folderPath;

	@SerializedName("minHoursToRead")
	private int minHoursToRead;

	@SerializedName("pages")
	private int pages;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("nameLocked")
	private boolean nameLocked;

	@SerializedName("id")
	private int id;

	@SerializedName("dontMatch")
	private boolean dontMatch;

	@SerializedName("sortNameLocked")
	private boolean sortNameLocked;

	@SerializedName("lowestFolderPath")
	private String lowestFolderPath;

	@SerializedName("localizedName")
	private String localizedName;

	@SerializedName("wordCount")
	private int wordCount;

	@SerializedName("created")
	private String created;

	@SerializedName("lastChapterAdded")
	private String lastChapterAdded;

	@SerializedName("format")
	private int format;

	@SerializedName("coverImageLocked")
	private boolean coverImageLocked;

	@SerializedName("localizedNameLocked")
	private boolean localizedNameLocked;

	@SerializedName("userRating")
	private int userRating;

	@SerializedName("isBlacklisted")
	private boolean isBlacklisted;

	@SerializedName("name")
	private String name;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}