package ru.feryafox.kavita4j.models.responses.series;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor public
class Series extends ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel {

	@SerializedName("summary")
	private String summary;

	@SerializedName("siteUrl")
	private String siteUrl;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("chapters")
	private int chapters;

	@SerializedName("synonyms")
	private List<String> synonyms;

	@SerializedName("volumes")
	private int volumes;

	@SerializedName("staff")
	private List<StaffItem> staff;

	@SerializedName("chapterDtos")
	private List<ChapterDtosItem> chapterDtos;

	@SerializedName("cbrId")
	private int cbrId;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("averageScore")
	private int averageScore;

	@SerializedName("coverUrl")
	private String coverUrl;

	@SerializedName("characters")
	private List<CharactersItem> characters;

	@SerializedName("provider")
	private int provider;

	@SerializedName("genres")
	private List<String> genres;

	@SerializedName("name")
	private String name;

	@SerializedName("publisher")
	private String publisher;

	@SerializedName("plusMediaFormat")
	private int plusMediaFormat;

	@SerializedName("relations")
	private List<RelationsItem> relations;

	@SerializedName("aniListId")
	private int aniListId;

	@SerializedName("malId")
	private int malId;

	@SerializedName("startDate")
	private String startDate;
}