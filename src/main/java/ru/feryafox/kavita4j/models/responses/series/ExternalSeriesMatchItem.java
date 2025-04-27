package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class ExternalSeriesMatchItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("series")
	private Series series;

	@SerializedName("matchRating")
	private int matchRating;
}