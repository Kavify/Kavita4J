package ru.feryafox.kavita4j.models.responses.series;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public
class RecentlyAddedItem extends BaseKavitaResponseModel {
	private String seriesName;
	private String created;
	private int chapterId;
	private int libraryId;
	private int volumeId;
	private int format;
	private int id;
	private int libraryType;
	private String title;
	private int seriesId;
}
