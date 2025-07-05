package io.github.evidentry.common.pagination;

import lombok.Builder;

@Builder
public record PageRequest(int pageNo, int pageSize, String... orderBy) {
}
