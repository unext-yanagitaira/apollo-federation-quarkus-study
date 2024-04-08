package my.groupId.service;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import my.groupId.entity.Book;
import my.groupId.entity.Book.Author;

@ApplicationScoped
public class BookService {

  public List<Book> getBookList() {
    return List.of(
        new Book("1", "春と修羅", new Author("1", "宮沢賢治", List.of())),
        new Book("2", "白痴", new Author("2", "坂口安吾", List.of())),
        new Book("3", "藪の中", new Author("3", "芥川龍之介", List.of())),
        new Book("4", "銀河鉄道の夜", new Author("1", "宮沢賢治", List.of())));
  }

}
