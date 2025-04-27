package ru.feryafox.kavita4j.models.requests.download;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DownloadBookmark extends BaseKavitaRequestModel {
	private List<BookmarksItem> bookmarks;
}