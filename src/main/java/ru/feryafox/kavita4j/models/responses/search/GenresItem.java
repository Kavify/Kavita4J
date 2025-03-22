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
class GenresItem extends BaseKavitaResponseModel {

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;
}