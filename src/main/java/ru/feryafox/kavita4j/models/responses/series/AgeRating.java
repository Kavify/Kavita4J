package ru.feryafox.kavita4j.models.responses.series;

import lombok.*;
import ru.feryafox.kavita4j.models.JsonValueHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgeRating extends BaseKavitaResponseModel implements JsonValueHolder<String> {
    private String ageRating;

    @Override
    public void setValue(String value) {
        this.ageRating = value;
    }
}
