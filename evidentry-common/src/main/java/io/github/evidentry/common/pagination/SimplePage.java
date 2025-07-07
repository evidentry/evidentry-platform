package io.github.evidentry.common.pagination;

import lombok.Builder;

import java.util.List;

@Builder
public record SimplePage<T>(
        List<T> content,
        Integer number,
        Integer size,
        Integer totalPages,
        Integer totalElements
) implements Page<T> {
}
