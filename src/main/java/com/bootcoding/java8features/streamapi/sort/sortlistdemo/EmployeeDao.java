package com.bootcoding.java8features.streamapi.sort.sortlistdemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ramesh", "IT", 500000.0));
        list.add(new Employee(1, "Suresh", "IT", 750000.0));
        list.add(new Employee(1, "Diya", "IT", 780000.0));
        return list;

    }
}
