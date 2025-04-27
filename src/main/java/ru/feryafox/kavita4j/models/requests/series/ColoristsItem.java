package ru.feryafox.kavita4j.models.requests.series;

import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public
class ColoristsItem extends BaseKavitaRequestModel {
    private String coverImage;
    private String name;
    private String primaryColor;
    private boolean coverImageLocked;
    private String description;
    private String asin;
    private int id;
    private String hardcoverId;
    private int aniListId;
    private int malId;
    private String secondaryColor;
}
