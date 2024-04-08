package my.groupId.resource;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import my.groupId.entity.Author;
import my.groupId.service.AuthorService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@ApplicationScoped
public class AuthorResource {

  @Inject AuthorService authorService;

  @Query("authors")
  public List<Author> getAuthorList() {
    return authorService.getAuthorList();
  }
}
