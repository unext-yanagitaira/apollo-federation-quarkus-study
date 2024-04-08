package my.groupId.entity;

import java.time.LocalDate;

public class Author {

  public Author(Integer id, String name, LocalDate birthday) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
  }

  public Integer id;
  public String name;
  public LocalDate birthday;
}
