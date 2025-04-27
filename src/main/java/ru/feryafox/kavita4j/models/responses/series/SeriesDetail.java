package ru.feryafox.kavita4j.models.responses.series;

import java.util.List;

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
class SeriesDetail extends BaseKavitaResponseModel {

	@SerializedName("specials")
	private List<SpecialsItem> specials;

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	@SerializedName("volumes")
	private List<VolumesItem> volumes;

	@SerializedName("storylineChapters")
	private List<StorylineChaptersItem> storylineChapters;

	@SerializedName("unreadCount")
	private int unreadCount;

	@SerializedName("totalCount")
	private int totalCount;
}