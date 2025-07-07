package io.github.evidentry.core.model;

public interface AuditEventPropertyFluentAccessor extends AuditEventPropertyAccessor {
    String name();

    String type();

    String value();

    @Override
    default String getName() {
        return name();
    }

    @Override
    default String getType() {
        return type();
    }

    @Override
    default String getValue() {
        return value();
    }
}
