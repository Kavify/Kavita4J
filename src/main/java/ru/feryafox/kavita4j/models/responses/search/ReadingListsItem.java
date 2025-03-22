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
class ReadingListsItem extends BaseKavitaResponseModel {

	@SerializedName("summary")
	private String summary;

	@SerializedName("startingYear")
	private int startingYear;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("coverImageLocked")
	private boolean coverImageLocked;

	@SerializedName("endingYear")
	private int endingYear;

	@SerializedName("title")
	private String title;

	@SerializedName("promoted")
	private boolean promoted;

	@SerializedName("itemCount")
	private int itemCount;

	@SerializedName("startingMonth")
	private int startingMonth;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("endingMonth")
	private int endingMonth;

	@SerializedName("id")
	private int id;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}