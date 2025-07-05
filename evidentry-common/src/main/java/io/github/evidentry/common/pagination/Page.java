package io.github.evidentry.common.pagination;

import java.util.List;
import java.util.stream.Stream;

public interface Page<T> extends Stream<T> {
    List<T> getContent();

    Integer getNumber();

    Integer getSize();

    Integer getTotalPages();

    Integer getTotalElements();
}
