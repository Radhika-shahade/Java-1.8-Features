package com.bootcoding.java8features.streamapi.sort.sortmapdemo;

import com.bootcoding.java8features.streamapi.sort.sortlistdemo.Employee;

import java.security.Key;
import java.util.*;

public class SortingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("eleven", 11);
        map.put("ten", 10);
        map.put("two", 2);

//        before java 8
        System.out.println("before java 8");
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(entries);
//        using lambda expression
        System.out.println("using lambda expression");
        Collections.sort(entries, (key1, key2) -> key1.getKey().compareTo(key2.getKey()));
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        using stream api
        System.out.println("using stream api");
//        comparing by key
        System.out.println("sorted by key");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        comparing by value
        System.out.println("sorted by value");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        Employee object sorting
//        Map<Employee, Integer>employee= new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary()-o2.getSalary());
//            }
//        });
//
        Map<Employee, Integer> employee = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employee.put(new Employee(1, "Roshan", "IT", 68000.0), 60);
        employee.put(new Employee(2, "siya", "core", 56000), 50);
        employee.put(new Employee(3, "jiya", "finance", 89000), 40);
        employee.put(new Employee(4, "prakash", "social", 120000), 36);
        System.out.println(employee);
        System.out.println("*************************************************************************");
        employee.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        System.out.println("for descending order");
        employee.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);

        List<Map.Entry<Employee, Integer>> entries1 = new ArrayList<>(employee.entrySet());
        Collections.sort(entries1, (o1, o2) -> o1.getKey().getName().compareTo(o2.getKey().getName()));


    }
}
