package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class CharactersItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("role")
	private int role;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("url")
	private String url;
}