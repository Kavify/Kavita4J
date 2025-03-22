package ru.feryafox.kavita4j.models.responses.search;

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
class BookmarksItem extends BaseKavitaResponseModel {

	@SerializedName("chapterId")
	private int chapterId;

	@SerializedName("seriesName")
	private String seriesName;

	@SerializedName("libraryId")
	private int libraryId;

	@SerializedName("volumeId")
	private int volumeId;

	@SerializedName("localizedSeriesName")
	private String localizedSeriesName;

	@SerializedName("seriesId")
	private int seriesId;
}