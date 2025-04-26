package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateSeries extends BaseKavitaRequestModel {
	private String localizedName;
	private String sortName;
	private boolean coverImageLocked;
	private int id;
	private boolean localizedNameLocked;
	private boolean sortNameLocked;
}
