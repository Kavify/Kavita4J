package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class RelationsItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("provider")
	private int provider;

	@SerializedName("seriesName")
	private SeriesName seriesName;

	@SerializedName("plusMediaFormat")
	private int plusMediaFormat;

	@SerializedName("aniListId")
	private int aniListId;

	@SerializedName("malId")
	private int malId;

	@SerializedName("relation")
	private int relation;
}