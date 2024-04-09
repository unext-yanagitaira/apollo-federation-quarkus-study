package my.groupId.resource;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.util.List;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@ApplicationScoped
public class AuthorResource {


  @Query("authors")
  public List<Author> getAuthors() {
    return getAuthorList();
  }

  @Query("author")
  public Author getAuthor(String id) {
    return getAuthorList().stream()
        .filter(author -> author.id().equals(id))
        .findFirst()
        .orElse(null);
  }

  protected List<Author> getAuthorList() {
    return List.of(
        new Author("1", "宮沢賢治", LocalDate.of(1896, 8, 27)),
        new Author("2", "坂口安吾", LocalDate.of(1906, 10, 20)),
        new Author("3", "芥川龍之介", LocalDate.of(1892, 3, 1)));
  }



}
