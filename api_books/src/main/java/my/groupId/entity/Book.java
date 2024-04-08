package my.groupId.entity;

public class Book {

  public Book(Integer id, Integer author_id, String title) {
    this.id = id;
    this.author_id = author_id;
    this.title = title;
  }

  public Integer id;
  public Integer author_id;
  public String title;
}
