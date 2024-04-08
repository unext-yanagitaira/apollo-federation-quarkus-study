package my.groupId.entity;

import java.time.LocalDate;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

public record Author(@Id Integer id, @NonNull String name, @NonNull LocalDate birthday) {}
