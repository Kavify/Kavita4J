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
public class RecentlyAddedItems extends BaseKavitaResponseModel implements JsonArrayHolder<RecentlyAddedItem> {
    private List<RecentlyAddedItem> items;

    @Override public void setItems(List<RecentlyAddedItem> items) {
        this.items = items;
    }
}
