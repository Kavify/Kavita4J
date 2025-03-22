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
class SeriesItem extends BaseKavitaResponseModel {

	@SerializedName("originalName")
	private String originalName;

	@SerializedName("libraryName")
	private String libraryName;

	@SerializedName("localizedName")
	private String localizedName;

	@SerializedName("sortName")
	private String sortName;

	@SerializedName("libraryId")
	private int libraryId;

	@SerializedName("name")
	private String name;

	@SerializedName("format")
	private int format;

	@SerializedName("seriesId")
	private int seriesId;
}