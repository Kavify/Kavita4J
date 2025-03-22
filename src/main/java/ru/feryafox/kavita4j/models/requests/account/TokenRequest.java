package ru.feryafox.kavita4j.models.requests.account;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenRequest extends BaseKavitaRequestModel {

	@SerializedName("token")
	private String token;

	@SerializedName("refreshToken")
	private String refreshToken;

}