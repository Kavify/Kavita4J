package ru.feryafox.kavita4j.models.responses.download;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.JsonValueHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Size extends BaseKavitaResponseModel implements JsonValueHolder<Long> {
    private Long size;

    @Override
    public void setValue(Long value) {
        this.size = value;
    }
}
