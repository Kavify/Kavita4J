package ru.feryafox.kavita4j.models.responses.account;

import lombok.*;
import ru.feryafox.kavita4j.models.JsonArrayHolder;
import ru.feryafox.kavita4j.models.responses.BaseKavitaResponseModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Roles
        extends BaseKavitaResponseModel
        implements JsonArrayHolder<String> {

    private List<String> roles;
    @Override public void setItems(List<String> items) { this.roles = items; }
}
