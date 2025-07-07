package io.github.evidentry.common.pagination;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Page<T> {
    List<T> content();

    Integer number();

    default Integer size() {
        return content() == null ? 0 : content().size();
    }

    Integer totalPages();

    Integer totalElements();

    default Stream<T> stream() {
        return content() == null ? Stream.empty() : content().stream();
    }

    default <U> Page<U> map(Function<T, U> mapper) {
        return stream()
                .map(mapper)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        l -> SimplePage.<U>builder()
                                .content(l)
                                .number(number())
                                .size(size())
                                .totalPages(totalPages())
                                .totalElements(totalElements())
                                .build()
                ));
    }
}
