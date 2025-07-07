package io.github.evidentry.core.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface AuditEventAccessor {
    UUID getId();

    String getCreatedBy();

    OffsetDateTime getCreatedAt();

    String getEntityId();

    String getEntityType();

    <T extends AuditEventPropertyAccessor> List<T> getProperties();

    Map<String, String> getAttributes();
}
