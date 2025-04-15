package ru.feryafox.kavita4j.models.responses.account;

import lombok.*;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Roles extends BaseKavitaResponseModel {
    private List<String> roles;
}
