package io.github.evidentry.core.spi;

import io.github.evidentry.common.pagination.PageResult;
import io.github.evidentry.common.pagination.PageRequest;
import io.github.evidentry.core.model.AuditEventAccessor;
import io.github.evidentry.core.model.AuditEventSearchCriteria;

public interface AuditEventService<E extends AuditEventAccessor> {
    E track(E auditEvent);

    PageResult<E> query(AuditEventSearchCriteria criteria, PageRequest pageRequest);
}
