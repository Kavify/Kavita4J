package ru.feryafox.kavita4j.models.responses.search;

import java.util.List;

import com.google.gson.annotations.SerializedName;
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
class LibrariesItem extends BaseKavitaResponseModel {

	@SerializedName("folderWatching")
	private boolean folderWatching;

	@SerializedName("folders")
	private List<String> folders;

	@SerializedName("excludePatterns")
	private List<String> excludePatterns;

	@SerializedName("libraryFileTypes")
	private List<Integer> libraryFileTypes;

	@SerializedName("type")
	private int type;

	@SerializedName("collapseSeriesRelationships")
	private boolean collapseSeriesRelationships;

	@SerializedName("allowMetadataMatching")
	private boolean allowMetadataMatching;

	@SerializedName("lastScanned")
	private String lastScanned;

	@SerializedName("allowScrobbling")
	private boolean allowScrobbling;

	@SerializedName("manageCollections")
	private boolean manageCollections;

	@SerializedName("includeInRecommended")
	private boolean includeInRecommended;

	@SerializedName("includeInSearch")
	private boolean includeInSearch;

	@SerializedName("includeInDashboard")
	private boolean includeInDashboard;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("manageReadingLists")
	private boolean manageReadingLists;
}