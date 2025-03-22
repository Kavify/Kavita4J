package ru.feryafox.kavita4j.models.requests.account;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Register extends BaseKavitaRequestModel {

	@SerializedName("password")
	private String password;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;
}