package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class TagsItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("rank")
	private int rank;

	@SerializedName("isMediaSpoiler")
	private boolean isMediaSpoiler;

	@SerializedName("isAdult")
	private boolean isAdult;

	@SerializedName("isGeneralSpoiler")
	private boolean isGeneralSpoiler;
}