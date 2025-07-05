package io.github.evidentry.common.pagination;

import lombok.Builder;

import java.util.List;

@Builder
public record PageResult<T>(
        List<T> content,
        int pageNo,
        int pageSize,
        int totalElements
) {
}
