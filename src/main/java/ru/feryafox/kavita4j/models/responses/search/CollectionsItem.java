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
public
class CollectionsItem extends BaseKavitaResponseModel {

	@SerializedName("summary")
	private String summary;

	@SerializedName("owner")
	private String owner;

	@SerializedName("lastSyncUtc")
	private String lastSyncUtc;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("coverImageLocked")
	private boolean coverImageLocked;

	@SerializedName("missingSeriesFromSource")
	private String missingSeriesFromSource;

	@SerializedName("ageRating")
	private int ageRating;

	@SerializedName("source")
	private int source;

	@SerializedName("title")
	private String title;

	@SerializedName("promoted")
	private boolean promoted;

	@SerializedName("itemCount")
	private int itemCount;

	@SerializedName("sourceUrl")
	private String sourceUrl;

	@SerializedName("totalSourceCount")
	private int totalSourceCount;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("id")
	private int id;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}