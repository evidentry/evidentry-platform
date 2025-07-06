package io.github.evidentry.core.spi;

import io.github.evidentry.core.model.AuditEventAccessor;

public interface AuditEventConsumer {
    void consume(AuditEventAccessor auditEvent);
}
