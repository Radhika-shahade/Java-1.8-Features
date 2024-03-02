package com.bootcoding.java8features.streamapi;

import com.bootcoding.java8features.lambadaexpression.Book;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//forEach() method  accept consumer functional interface
//default void forEach(Consumer<? super T> action) {
//        Objects.requireNonNull(action);
//        for (T t : this) {
//            action.accept(t);
//        }
public class ForEachMethodExample {
    public static void forEachWithList()
    {
        List<Book> items = new ArrayList< >();
        items.add(new Book(1, 100,"core Java"));
        items.add(new Book(2, 200,"Hibernate"));
        items.add(new Book(3, 270,"A Tale of Two Cities"));
        items.add(new Book(100, 400, "Harry Potter and the Philosopher's Stone"));
        items.add(new Book(100, 78,"And Then There Were None"));
//   using lambda expression
        items.forEach(value-> System.out.println(value));
//        using stream and filter
//        items.stream().filter()
//        filter() method internally uses predicate method
        System.out.println("names start with h");
        items.stream().filter(t->t.getName().startsWith("H")).forEach(name-> System.out.println(name));
    }

    public static void forEachWithMap()
    {
        Map<Integer, String> map= new HashMap<>();
        map.put(1, "Ramesh");
        map.put(2,"suresh");
        map.put(3,"jiya");

        map.forEach((key, value)-> System.out.println("key:"+key +" value:" +value));
        map.entrySet().stream().forEach(value-> System.out.println(value));
        System.out.println(" filtered values");

        map.entrySet().stream().filter(value->value.getKey()%2==0).forEach(value-> System.out.println(value));
    }

    public static void main(String[] args) {
       forEachWithList();
       forEachWithMap();

    }
}
