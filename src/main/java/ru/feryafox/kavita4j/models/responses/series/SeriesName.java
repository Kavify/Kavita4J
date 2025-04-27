package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class SeriesName extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("nativeTitle")
	private String nativeTitle;

	@SerializedName("preferredTitle")
	private String preferredTitle;

	@SerializedName("englishTitle")
	private String englishTitle;

	@SerializedName("romajiTitle")
	private String romajiTitle;
}