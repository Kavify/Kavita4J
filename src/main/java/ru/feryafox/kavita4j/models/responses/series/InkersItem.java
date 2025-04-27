package ru.feryafox.kavita4j.models.responses.series;

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
class InkersItem extends BaseKavitaResponseModel {

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("name")
	private String name;

	@SerializedName("primaryColor")
	private String primaryColor;

	@SerializedName("coverImageLocked")
	private boolean coverImageLocked;

	@SerializedName("description")
	private String description;

	@SerializedName("asin")
	private String asin;

	@SerializedName("id")
	private int id;

	@SerializedName("hardcoverId")
	private String hardcoverId;

	@SerializedName("aniListId")
	private int aniListId;

	@SerializedName("malId")
	private int malId;

	@SerializedName("secondaryColor")
	private String secondaryColor;
}