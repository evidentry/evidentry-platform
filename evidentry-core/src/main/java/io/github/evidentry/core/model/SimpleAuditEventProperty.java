package io.github.evidentry.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimpleAuditEventProperty implements AuditEventPropertyAccessor, Serializable {
    private String name;
    private String value;
    private String type;
}
