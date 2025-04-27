package ru.feryafox.kavita4j.models.responses.series;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class ChapterDtosItem extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("summary")
	private String summary;

	@SerializedName("userReviews")
	private List<UserReviewsItem> userReviews;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("coverImageUrl")
	private String coverImageUrl;

	@SerializedName("issueNumber")
	private String issueNumber;

	@SerializedName("writers")
	private List<String> writers;

	@SerializedName("title")
	private String title;

	@SerializedName("criticReviews")
	private List<CriticReviewsItem> criticReviews;

	@SerializedName("userRating")
	private int userRating;

	@SerializedName("issueUrl")
	private String issueUrl;

	@SerializedName("artists")
	private List<String> artists;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("criticRating")
	private int criticRating;
}