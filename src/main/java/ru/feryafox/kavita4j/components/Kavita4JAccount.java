package ru.feryafox.kavita4j.components;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.models.requests.account.ResetPassword;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.RawResponse;
import ru.feryafox.kavita4j.models.responses.account.Roles;
import ru.feryafox.kavita4j.models.responses.account.User;

import java.util.List;

public class Kavita4JAccount {
    private final BaseAuthHttpClient client;
    private final Gson gson;

    public Kavita4JAccount(BaseAuthHttpClient client, Gson gson) {
        this.client = client;
        this.gson = gson;
    }

    public HttpClientResponse<User> refreshAccount() {
        return client.getAuth(User.class, "api", "Account", "refresh-account");
    }

    public HttpClientResponse<Roles> roles() {
        HttpClientResponse<RawResponse> rawResponse = client.getAuth(RawResponse.class, "api", "Account", "roles");

        if (rawResponse.isSuccess()) {
            List<String> rolesList = gson.fromJson(rawResponse.responseModel().raw(), new TypeToken<List<String>>() {}.getType());
            return HttpClientResponse.from(
                    rawResponse.statusCode(),
                    Roles.builder()
                            .roles(rolesList)
                            .build()
                    );
        } else {
            return HttpClientResponse.from(
                    rawResponse.statusCode(),
                    rawResponse.errorMessage()
            );
        }
    }
}
