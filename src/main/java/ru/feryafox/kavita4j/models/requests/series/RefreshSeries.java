package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshSeries extends BaseKavitaRequestModel {
	private boolean forceColorscape;
	private int libraryId;
	private boolean forceUpdate;
	private int seriesId;
}
