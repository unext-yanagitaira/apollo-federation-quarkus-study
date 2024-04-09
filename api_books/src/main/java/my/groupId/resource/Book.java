package my.groupId.resource;

import io.smallrye.graphql.api.federation.Extends;
import io.smallrye.graphql.api.federation.External;
import io.smallrye.graphql.api.federation.Key;
import java.util.List;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;

@Key(fields = "id")
public record Book(@Id String id, @NonNull String title, @NonNull Author author) {

  @Extends
  @Key(fields = "id")
  public record Author(@Id @External String id, String name, List<Book> books) {
  }

}

//public record Book(@Id String id, @NonNull String author_id, @NonNull String title) {
//}
