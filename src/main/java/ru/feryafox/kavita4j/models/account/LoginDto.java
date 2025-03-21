package ru.feryafox.kavita4j.models.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.BaseKavitaModel;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto implements BaseKavitaModel {
    private String username;
    private String password;
    private String apiKey;
}
