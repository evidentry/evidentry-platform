package io.github.evidentry.core.spi;

import io.github.evidentry.core.model.AuditEventAccessor;

public interface AuditEventPublisher {
    void publish(AuditEventAccessor auditEvent);
}
