package ru.feryafox.kavita4j.components;

import ru.feryafox.kavita4j.http.BaseAuthHttpClient;
import ru.feryafox.kavita4j.http.HttpClientResponse;
import ru.feryafox.kavita4j.models.responses.NoneResponse;
import ru.feryafox.kavita4j.models.responses.account.User;

public class Kavita4JAccount {
    private final BaseAuthHttpClient client;

    public Kavita4JAccount(BaseAuthHttpClient client) {
        this.client = client;
    }

    public HttpClientResponse<User> refreshAccount() {
        return client.getAuth(User.class, "api", "Account", "refresh");
    }
}
