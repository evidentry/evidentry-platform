package io.github.evidentry.common.pagination;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

@Builder
public record SimplePagination(
        Integer number,
        Integer size,
        @Singular("addOrder") Set<String> orderBy
) implements Pagination {
}
