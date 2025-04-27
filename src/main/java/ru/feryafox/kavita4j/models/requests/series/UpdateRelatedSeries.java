package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateRelatedSeries extends BaseKavitaRequestModel {
	private List<Integer> annuals;
	private List<Integer> sequels;
	private List<Integer> spinOffs;
	private List<Integer> sideStories;
	private int seriesId;
	private List<Integer> doujinshis;
	private List<Integer> characters;
	private List<Integer> contains;
	private List<Integer> editions;
	private List<Integer> adaptations;
	private List<Integer> prequels;
	private List<Integer> alternativeSettings;
	private List<Integer> others;
	private List<Integer> alternativeVersions;
}