package my.groupId.resource;

import java.time.LocalDate;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

public record Author(@Id String id, @NonNull String name, @NonNull LocalDate birthday) {}
