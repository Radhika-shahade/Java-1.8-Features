package com.bootcoding.java8features.streamapi.sort.sortlistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(3);
//       by default sorted in ascending order
        list.stream().sorted().forEach(num -> System.out.println(num));
//        sorting in reverse order
        System.out.println("in descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));

//       for custom sorting
        List<Employee> employees = EmployeeDao.getEmployees();
//       before java 8
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });
//        using lambda expression
        System.out.println("");
      Collections.sort(employees, (o1,o2)->
              (int) (o1.getSalary()- o2.getSalary()));
        System.out.println(employees);

//      using stream api
        System.out.println("using stream api");
        employees.stream().sorted((emp1,emp2)-> (int) (emp1.getSalary()- emp2.getSalary())).forEach(System.out::println);
        System.out.println("another way");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }
}
