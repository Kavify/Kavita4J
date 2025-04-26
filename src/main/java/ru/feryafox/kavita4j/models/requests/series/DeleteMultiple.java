package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteMultiple extends BaseKavitaRequestModel{
	private List<Integer> seriesIds;
}