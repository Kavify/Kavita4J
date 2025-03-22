package ru.feryafox.kavita4j.models.responses.account;

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
class Theme extends BaseKavitaResponseModel {

	@SerializedName("fileName")
	private String fileName;

	@SerializedName("isDefault")
	private boolean isDefault;

	@SerializedName("compatibleVersion")
	private String compatibleVersion;

	@SerializedName("provider")
	private int provider;

	@SerializedName("previewUrls")
	private List<String> previewUrls;

	@SerializedName("author")
	private String author;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("selector")
	private String selector;

	@SerializedName("id")
	private int id;

	@SerializedName("normalizedName")
	private String normalizedName;
}