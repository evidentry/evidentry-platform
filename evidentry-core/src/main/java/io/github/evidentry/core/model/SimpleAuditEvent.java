package io.github.evidentry.core.model;

import lombok.Builder;
import lombok.Singular;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Builder
public record SimpleAuditEvent(
        UUID id,
        String createdBy,
        OffsetDateTime createdAt,
        String entityId,
        String entityType,
        @Singular List<SimpleAuditEventProperty> properties,
        @Singular Map<String, String> attributes
) implements AuditEventFluentAccessor {
}
