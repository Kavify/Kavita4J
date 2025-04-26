package ru.feryafox.kavita4j.components;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.models.responses.RawResponse;
import ru.feryafox.kavita4j.models.responses.account.Roles;
import ru.feryafox.kavita4j.models.responses.account.User;

import java.util.List;

public class Kavita4JAccount {
    private final BaseAuthHttpClient client;

    public Kavita4JAccount(BaseAuthHttpClient client) {
        this.client = client;
    }

    public HttpClientResponse<User> refreshAccount() {
        return client.getAuth(User.class, "api", "Account", "refresh-account");
    }

    public HttpClientResponse<Roles> roles() {
        return client.getAuth(Roles.class, "api", "Account", "roles");
    }
}
