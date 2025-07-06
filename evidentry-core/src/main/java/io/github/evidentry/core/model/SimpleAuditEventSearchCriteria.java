package io.github.evidentry.core.model;

import java.time.OffsetDateTime;

public record SimpleAuditEventSearchCriteria(
        String entityId,
        OffsetDateTime from,
        OffsetDateTime to
) implements AuditEventSearchCriteria {
    @Override
    public String getEntityId() {
        return entityId();
    }

    @Override
    public OffsetDateTime getFrom() {
        return from();
    }

    @Override
    public OffsetDateTime getTo() {
        return to();
    }
}
