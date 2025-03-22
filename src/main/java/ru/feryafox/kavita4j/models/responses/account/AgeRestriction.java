package ru.feryafox.kavita4j.models.responses.account;

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
public class AgeRestriction extends BaseKavitaResponseModel {

	@SerializedName("includeUnknowns")
	private boolean includeUnknowns;

	@SerializedName("ageRating")
	private int ageRating;
}