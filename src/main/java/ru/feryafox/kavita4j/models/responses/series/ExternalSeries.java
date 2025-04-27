package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalSeries extends BaseKavitaResponseModel {

	@SerializedName("coverUrl")
	private String coverUrl;

	@SerializedName("summary")
	private String summary;

	@SerializedName("provider")
	private int provider;

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	@SerializedName("aniListId")
	private int aniListId;

	@SerializedName("malId")
	private int malId;
}