package ru.feryafox.kavita4j.models.requests.download;


import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookmarksItem extends BaseKavitaRequestModel {
	private int chapterId;
	private Series series;
	private int volumeId;
	private int id;
	private int page;
	private int seriesId;
}
