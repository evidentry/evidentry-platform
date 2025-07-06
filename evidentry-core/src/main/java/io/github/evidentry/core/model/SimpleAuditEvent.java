package io.github.evidentry.core.model;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimpleAuditEvent implements AuditEventAccessor, Serializable {
    @Setter(AccessLevel.PROTECTED)
    private UUID id;
    private String createdBy;
    @Setter(AccessLevel.PROTECTED)
    private Instant createdAt;
    private String entityId;
    private String entityType;
    private List<SimpleAuditEventProperty> properties;
    private Map<String, String> attributes;
}
