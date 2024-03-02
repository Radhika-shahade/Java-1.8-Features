package com.bootcoding.java8features.lambadaexpression;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getBooks()
    {
        List<Book>books= new ArrayList<>();

        books.add(new Book(1, 100,"core Java"));
        books.add(new Book(2, 300,"Hibernate"));
        books.add(new Book(3, 1600,"webservices"));
        return books;
    }
}
