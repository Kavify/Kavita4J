package ru.feryafox.kavita4j.models.requests.account;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Login extends BaseKavitaRequestModel {
    private String username;
    private String password;
    private String apiKey;
}
