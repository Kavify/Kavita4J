package ru.feryafox.kavita4j.models.responses.series;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.JsonArrayHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Volumes
		extends BaseKavitaResponseModel
		implements JsonArrayHolder<Volume> {

	private List<Volume> items;

	@Override public void setItems(List<Volume> items) { this.items = items; }
}