package io.github.evidentry.common.pagination;

import java.util.Set;

public interface Pagination {
    Integer number();

    Integer size();

    Set<String> orderBy();
}
