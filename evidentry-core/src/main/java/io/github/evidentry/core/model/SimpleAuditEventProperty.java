package io.github.evidentry.core.model;

import lombok.Builder;

@Builder
public record SimpleAuditEventProperty(
        String name,
        String value,
        String type
) implements AuditEventPropertyFluentAccessor {
}
