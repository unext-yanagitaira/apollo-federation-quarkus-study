package my.groupId.resource;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import my.groupId.resource.Book.Author;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@ApplicationScoped
public class BookResource {

  @Query("books")
  public List<Book> getBooks() {
    return getBookList();
  }

  @Query("book")
  public Book getBook(String id) {
    return getBookList().stream()
        .filter(book -> book.id().equals(id))
        .findFirst()
        .orElse(null);
  }


  public List<Book> getBookList() {
    return List.of(
        new Book("1", "春と修羅", new Author("1", "宮沢賢治", List.of())),
        new Book("2", "白痴", new Author("2", "坂口安吾", List.of())),
        new Book("3", "藪の中", new Author("3", "芥川龍之介", List.of())),
        new Book("4", "銀河鉄道の夜", new Author("1", "宮沢賢治", List.of())));
  }

//  protected List<Book> getBookList() {
//    return List.of(
//        new Book("1", "1", "春と修羅"),
//        new Book("2", "2","白痴"),
//        new Book("3", "3","藪の中"),
//        new Book("4", "1","銀河鉄道の夜"));
//  }

}
