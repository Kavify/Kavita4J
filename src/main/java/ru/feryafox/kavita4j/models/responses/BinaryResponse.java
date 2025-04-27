package ru.feryafox.kavita4j.models.responses;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Builder
public class BinaryResponse extends BaseKavitaResponseModel{
    private byte[] data;
    private String filename;
}
