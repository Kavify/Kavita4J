package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatementsItem extends BaseKavitaRequestModel {
	private int comparison;
	private int field;
	private String value;
}