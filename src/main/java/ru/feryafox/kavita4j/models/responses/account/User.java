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
public
class User extends BaseKavitaResponseModel {

	@SerializedName("preferences")
	private Preferences preferences;

	@SerializedName("apiKey")
	private String apiKey;

	@SerializedName("ageRestriction")
	private AgeRestriction ageRestriction;

	@SerializedName("kavitaVersion")
	private String kavitaVersion;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	@SerializedName("token")
	private String token;

	@SerializedName("refreshToken")
	private String refreshToken;
}