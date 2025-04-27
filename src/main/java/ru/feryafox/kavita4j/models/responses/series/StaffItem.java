package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class StaffItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("role")
	private String role;

	@SerializedName("gender")
	private String gender;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("url")
	private String url;
}