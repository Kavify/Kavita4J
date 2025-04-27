package ru.feryafox.kavita4j.models.responses.series;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.JsonArrayHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalSeriesMatch extends BaseKavitaResponseModel implements JsonArrayHolder<ExternalSeriesMatchItem> {

	@SerializedName("ExternalSeriesMatch")
	private List<ExternalSeriesMatchItem> externalSeriesMatch;

	@Override
	public void setItems(List<ExternalSeriesMatchItem> items) {
		this.externalSeriesMatch = items;
	}
}