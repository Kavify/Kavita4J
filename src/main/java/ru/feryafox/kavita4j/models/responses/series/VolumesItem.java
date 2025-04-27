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
class VolumesItem extends BaseKavitaResponseModel {

	@SerializedName("pagesRead")
	private int pagesRead;

	@SerializedName("wordCount")
	private int wordCount;

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	@SerializedName("created")
	private String created;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("maxHoursToRead")
	private int maxHoursToRead;

	@SerializedName("avgHoursToRead")
	private int avgHoursToRead;

	@SerializedName("seriesId")
	private int seriesId;

	@SerializedName("lastModifiedUtc")
	private String lastModifiedUtc;

	@SerializedName("minHoursToRead")
	private int minHoursToRead;

	@SerializedName("minNumber")
	private int minNumber;

	@SerializedName("maxNumber")
	private int maxNumber;

	@SerializedName("pages")
	private int pages;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("createdUtc")
	private String createdUtc;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}