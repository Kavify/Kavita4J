package ru.feryafox.kavita4j.models.responses.account;

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
class Preferences extends BaseKavitaResponseModel {

	@SerializedName("promptForDownloadSize")
	private boolean promptForDownloadSize;

	@SerializedName("wantToReadSync")
	private boolean wantToReadSync;

	@SerializedName("bookReaderWritingStyle")
	private int bookReaderWritingStyle;

	@SerializedName("scalingOption")
	private int scalingOption;

	@SerializedName("locale")
	private String locale;

	@SerializedName("noTransitions")
	private boolean noTransitions;

	@SerializedName("aniListScrobblingEnabled")
	private boolean aniListScrobblingEnabled;

	@SerializedName("pdfSpreadMode")
	private int pdfSpreadMode;

	@SerializedName("blurUnreadSummaries")
	private boolean blurUnreadSummaries;

	@SerializedName("theme")
	private Theme theme;

	@SerializedName("swipeToPaginate")
	private boolean swipeToPaginate;

	@SerializedName("bookReaderThemeName")
	private String bookReaderThemeName;

	@SerializedName("emulateBook")
	private boolean emulateBook;

	@SerializedName("showScreenHints")
	private boolean showScreenHints;

	@SerializedName("bookReaderTapToPaginate")
	private boolean bookReaderTapToPaginate;

	@SerializedName("shareReviews")
	private boolean shareReviews;

	@SerializedName("backgroundColor")
	private String backgroundColor;

	@SerializedName("bookReaderImmersiveMode")
	private boolean bookReaderImmersiveMode;

	@SerializedName("pdfTheme")
	private int pdfTheme;

	@SerializedName("bookReaderFontFamily")
	private String bookReaderFontFamily;

	@SerializedName("bookReaderLayoutMode")
	private int bookReaderLayoutMode;

	@SerializedName("bookReaderLineSpacing")
	private int bookReaderLineSpacing;

	@SerializedName("collapseSeriesRelationships")
	private boolean collapseSeriesRelationships;

	@SerializedName("readingDirection")
	private int readingDirection;

	@SerializedName("globalPageLayoutMode")
	private int globalPageLayoutMode;

	@SerializedName("bookReaderReadingDirection")
	private int bookReaderReadingDirection;

	@SerializedName("bookReaderFontSize")
	private int bookReaderFontSize;

	@SerializedName("autoCloseMenu")
	private boolean autoCloseMenu;

	@SerializedName("layoutMode")
	private int layoutMode;

	@SerializedName("pageSplitOption")
	private int pageSplitOption;

	@SerializedName("pdfScrollMode")
	private int pdfScrollMode;

	@SerializedName("bookReaderMargin")
	private int bookReaderMargin;

	@SerializedName("pdfLayoutMode")
	private int pdfLayoutMode;

	@SerializedName("readerMode")
	private int readerMode;
}