package my.groupId.resource;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import my.groupId.entity.Book;
import my.groupId.service.BookService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@ApplicationScoped
public class BookResource {

  @Inject BookService bookService;

  @Query("books")
  public List<Book> getBookList() {
    return bookService.getBookList();
  }
}
