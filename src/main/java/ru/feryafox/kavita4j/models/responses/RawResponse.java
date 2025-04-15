package ru.feryafox.kavita4j.models.responses;

public class RawResponse extends BaseKavitaResponseModel {
    private final String raw;

    public RawResponse(String raw) {
        this.raw = raw;
    }

    public String raw() {
        return raw;
    }
}
