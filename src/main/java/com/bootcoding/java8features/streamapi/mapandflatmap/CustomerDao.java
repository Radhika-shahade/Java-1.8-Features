package com.bootcoding.java8features.streamapi.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "ramesh", "ramesh@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "joy", "joy@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kiya", "kiya@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}
