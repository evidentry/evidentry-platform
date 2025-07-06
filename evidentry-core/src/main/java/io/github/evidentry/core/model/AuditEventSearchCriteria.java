package io.github.evidentry.core.model;

import java.time.OffsetDateTime;

public interface AuditEventSearchCriteria {
    String getEntityId();

    OffsetDateTime getFrom();

    OffsetDateTime getTo();
}
