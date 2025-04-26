package ru.feryafox.kavita4j.models;

import java.util.List;

public interface JsonArrayHolder<E> {
    void setItems(List<E> items);
}
