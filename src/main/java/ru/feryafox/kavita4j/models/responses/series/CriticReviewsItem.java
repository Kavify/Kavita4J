package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class CriticReviewsItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("siteUrl")
	private String siteUrl;

	@SerializedName("isExternal")
	private boolean isExternal;

	@SerializedName("libraryId")
	private int libraryId;

	@SerializedName("rating")
	private int rating;

	@SerializedName("body")
	private String body;

	@SerializedName("seriesId")
	private int seriesId;

	@SerializedName("bodyJustText")
	private String bodyJustText;

	@SerializedName("score")
	private int score;

	@SerializedName("rawBody")
	private String rawBody;

	@SerializedName("provider")
	private int provider;

	@SerializedName("totalVotes")
	private int totalVotes;

	@SerializedName("tagline")
	private String tagline;

	@SerializedName("username")
	private String username;
}