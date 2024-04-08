package my.groupId.service;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.util.List;
import my.groupId.entity.Author;

@ApplicationScoped
public class AuthorService {

  public List<Author> getAuthorList() {
    return List.of(
        new Author(1, "宮沢賢治", LocalDate.of(1896, 8, 27)),
        new Author(2, "坂口安吾", LocalDate.of(1906, 10, 20)),
        new Author(3, "芥川龍之介", LocalDate.of(1892, 3, 1)));
  }

}
