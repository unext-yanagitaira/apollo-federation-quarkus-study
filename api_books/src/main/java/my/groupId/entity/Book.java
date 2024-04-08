package my.groupId.entity;

import io.smallrye.graphql.api.federation.Extends;
import io.smallrye.graphql.api.federation.Key;
import java.util.List;

@Key(fields = "id")
public record Book(String id, String title, Author author) {

  @Extends @Key(fields = "id")
  public record Author(String id, String name, List<Book> books) {
  }

}