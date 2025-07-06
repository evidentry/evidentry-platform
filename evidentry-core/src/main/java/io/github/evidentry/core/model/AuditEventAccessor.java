package io.github.evidentry.core.model;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AuditEventAccessor {
    UUID getId();

    String getCreatedBy();

    Instant getCreatedAt();

    String getEntityId();

    String getEntityType();

    <T extends AuditEventPropertyAccessor> List<T> getProperties();

    Map<String, String> getAttributes();
}
