package ru.feryafox.kavita4j.models.responses.series;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NextExpectedChapter extends BaseKavitaResponseModel {

	@SerializedName("volumeNumber")
	private int volumeNumber;

	@SerializedName("chapterNumber")
	private int chapterNumber;

	@SerializedName("expectedDate")
	private String expectedDate;

	@SerializedName("title")
	private String title;
}