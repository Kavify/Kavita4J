package ru.feryafox.kavita4j.models.responses.series;

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
class FilesItem extends BaseKavitaResponseModel {

	@SerializedName("extension")
	private String extension;

	@SerializedName("pages")
	private int pages;

	@SerializedName("bytes")
	private int bytes;

	@SerializedName("created")
	private String created;

	@SerializedName("filePath")
	private String filePath;

	@SerializedName("format")
	private int format;

	@SerializedName("id")
	private int id;
}