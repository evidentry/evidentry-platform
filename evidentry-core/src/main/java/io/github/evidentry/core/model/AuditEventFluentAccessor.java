package io.github.evidentry.core.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AuditEventFluentAccessor extends AuditEventAccessor {
    UUID id();

    String createdBy();

    OffsetDateTime createdAt();

    String entityId();

    String entityType();

    <T extends AuditEventPropertyAccessor> List<T> properties();

    Map<String, String> attributes();

    @Override
    default UUID getId() {
        return id();
    }

    @Override
    default String getCreatedBy() {
        return createdBy();
    }

    @Override
    default OffsetDateTime getCreatedAt() {
        return createdAt();
    }

    @Override
    default String getEntityId() {
        return entityId();
    }

    @Override
    default String getEntityType() {
        return entityType();
    }

    @Override
    default <T extends AuditEventPropertyAccessor> List<T> getProperties() {
        return properties();
    }

    @Override
    default Map<String, String> getAttributes() {
        return attributes();
    }
}
