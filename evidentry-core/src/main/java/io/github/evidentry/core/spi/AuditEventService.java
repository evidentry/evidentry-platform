package io.github.evidentry.core.spi;

import io.github.evidentry.common.pagination.Page;
import io.github.evidentry.common.pagination.Pagination;
import io.github.evidentry.core.model.AuditEventAccessor;

public interface AuditEventService<E extends AuditEventAccessor> {
    E track(E auditEvent);

    Page<E> query(String entityId, Pagination pagination);
}
