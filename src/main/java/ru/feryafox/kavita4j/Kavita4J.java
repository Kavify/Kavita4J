package ru.feryafox.kavita4j;

import com.google.gson.Gson;
import ru.feryafox.kavita4j.components.*;
import ru.feryafox.kavita4j.http.BaseHttpClient;
import ru.feryafox.kavita4j.http.HttpClient;

public class Kavita4J {
    private final BaseHttpClient client;
    private final Kavita4JAuth auth;
    private final Kavita4JSearch search;
    private final Kavita4JImage image;
    private final Kavita4JAccount account;
    private final Kavita4JSeries series;

    public Kavita4J(String baseUrl) {
        this(new HttpClient(baseUrl));
    }

    public Kavita4J(BaseHttpClient client) {
        this.client = client;
        this.auth = new Kavita4JAuth(client);
        this.search = new Kavita4JSearch(auth);
        this.image = new Kavita4JImage(auth);
        this.account = new Kavita4JAccount(auth);
        this.series = new Kavita4JSeries(auth);
    }

    public Kavita4JAuth auth() {
        return auth;
    }

    public Kavita4JSearch search() {
        return search;
    }

    public Kavita4JImage image() {
        return image;
    }

    public Kavita4JAccount account() {
        return account;
    }

    public Kavita4JSeries series() {
        return series;
    }

    public void setBaseUrl(String baseUrl) {
        client.setBaseUrl(baseUrl);
    }
}
