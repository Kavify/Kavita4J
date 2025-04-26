package ru.feryafox.kavita4j.models.responses.series;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.JsonValueHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class IsSuccessfulDeleted
        extends BaseKavitaResponseModel
        implements JsonValueHolder<Boolean> {

    private Boolean value;
    @Override public void setValue(Boolean value) { this.value = value; }
}
