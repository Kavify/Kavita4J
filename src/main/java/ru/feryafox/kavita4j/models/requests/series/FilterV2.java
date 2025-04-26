package ru.feryafox.kavita4j.models.requests.series;

import java.util.List;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilterV2 extends BaseKavitaRequestModel {
	private SortOptions sortOptions;
	private String name;
	private int limitTo;
	private List<StatementsItem> statements;
	private int id;
	private int combination;
}