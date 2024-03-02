package com.bootcoding.java8features.lambadaexpression;

import java.util.Objects;

public class Book {
    private int id ;
    private int pages;
    private String name;

  public Book(int id, int pages, String name)
  {
   this.id=id;
   this.pages=pages;
   this.name=name;

  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }
}
