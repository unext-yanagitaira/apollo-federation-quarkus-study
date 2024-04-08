package my.groupId.service;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import my.groupId.entity.Book;

@ApplicationScoped
public class BookService {

  public List<Book> getBookList() {
    return List.of(
        new Book(1, 1, "春と修羅"),
        new Book(2, 2, "白痴"),
        new Book(3, 3, "藪の中"),
        new Book(4, 1, "銀河鉄道の夜"));
  }

}
