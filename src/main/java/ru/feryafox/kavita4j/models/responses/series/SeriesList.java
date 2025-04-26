package ru.feryafox.kavita4j.models.responses.series;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.JsonArrayHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SeriesList extends BaseKavitaResponseModel implements JsonArrayHolder<Series> {
    private List<Series> series;

    @Override public void setItems(List<Series> items) {
        this.series = items;
    }
}
