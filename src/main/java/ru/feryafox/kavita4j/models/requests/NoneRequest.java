package ru.feryafox.kavita4j.models.requests;

public class NoneRequest extends BaseKavitaRequestModel{
    private NoneRequest() {}

    public static NoneRequest create() {
        return new NoneRequest();
    }
}
