package ru.feryafox.kavita4j.models.requests.series;


import lombok.*;
import ru.feryafox.kavita4j.models.requests.BaseKavitaRequestModel;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateRating extends BaseKavitaRequestModel {
    private int seriesId;
    private int userRating;
}
