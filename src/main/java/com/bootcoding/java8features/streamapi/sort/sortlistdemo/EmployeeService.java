package com.bootcoding.java8features.streamapi.sort.sortlistdemo;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public  static  List<Employee> evaluateTaxUsers(String input) {
        if (input.equalsIgnoreCase("tax")) {
            return EmployeeDao.getEmployees().stream().filter(emp -> emp.getSalary() > 600000).collect(Collectors.toList());
        }
        else {
            return EmployeeDao.getEmployees().stream().filter(employee -> employee.getSalary()<500000).collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
    }
}
