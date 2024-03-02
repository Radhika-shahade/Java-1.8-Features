package com.bootcoding.java8features.lambadaexpression;

import java.util.Collections;
import java.util.List;

public class BookService {
    public List<Book>getSortedList()
    {
        List<Book> books = new BookDao().getBooks();
//        Collections.sort(books, new MyComparator());
        Collections.sort(books, (o1,o2)->
            o2.getName().compareTo(o1.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getSortedList());
    }
}
