package io.github.evidentry.common.pagination;

import java.util.Set;

public interface Pagination {
    Integer getNumber();

    Integer getSize();

    Set<String> getOrderBy();
}
