package com.bootcoding.java8features.streamapi.sort.sortmapdemo;

import java.util.*;

public class SortingMap {
    public static void main(String[] args) {
        Map<String , Integer> map= new HashMap<>();
        map.put("eight",8);
        map.put("eleven",11);
        map.put("ten",10);
        map.put("two",2);

//        before java 8
        System.out.println("before java 8");
        List<Map.Entry<String ,Integer>>entries= new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()- o2.getValue();
            }
        });
        System.out.println(entries);
//        using lambda expression
        System.out.println("using lambda expression");
        Collections.sort(entries, (key1,key2)->key1.getKey().compareTo(key2.getKey()));
        for(Map.Entry<String,Integer>entry:entries)
        {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
//        using stream api
        System.out.println("using stream api");
//        comparing by key
        System.out.println("sorted by key");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        comparing by value
        System.out.println("sorted by value");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
