package com.bootcoding.java8features.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
//        before java 8
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);
//
        int sum1 = numbers.stream().mapToInt((n) -> n).sum();
        System.out.println(sum1);
        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer multiplication = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplication);
        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);
        Integer maxValue1 = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValue1);
        String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);

//        get employee whose grade is a
        System.out.println("average salary");
        double averageSalary = EmployeeDao.getEmployees().stream().filter(employee -> employee.getGrade().
                        equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(averageSalary);
//        sum of salary of people whose grade is a
        System.out.println("sum of salary");
       double sumOfSalary= EmployeeDao.getEmployees().stream().filter(employee -> employee.getGrade()
                        .equalsIgnoreCase("a"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumOfSalary);
    }
}
