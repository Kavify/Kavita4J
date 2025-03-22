package ru.feryafox.kavita4j.models.requests.account;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResetPassword extends BaseKavitaRequestModel {

	@SerializedName("password")
	private String password;

	@SerializedName("oldPassword")
	private String oldPassword;

	@SerializedName("userName")
	private String userName;
}