package com.bootcoding.java8features.optional;

import com.bootcoding.java8features.streamapi.mapandflatmap.Customer;
import com.bootcoding.java8features.streamapi.mapandflatmap.CustomerDao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static Optional<Customer> getCustomerByEmailId(String email)
    {
        List<Customer>customers =CustomerDao.getAll();
        Optional<Customer> customer = Optional.of(customers.stream().
                filter(customer1 -> customer1.getEmail().equals(email)).
                findAny().orElseThrow(()->new RuntimeException("no such email present")));
        return customer;
    }
    public static void main(String[] args) {
        Customer customer = new Customer(101, "ramesh", null, Arrays.asList("397937955", "21654725"));
//         Three ways to create optional object
//         empty
//         of
//         ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
//        if object that is paaing is never null then use Optional.of method
//        if object is null it will throw null pointer exception
//        Optional<String> email = Optional.of(customer.getEmail());
//        System.out.println(email);

//       if value is null ofNullable not throw the exception it return Optional.empty
        Optional<String> email1 = Optional.ofNullable(customer.getEmail());
        System.out.println(email1);

        System.out.println(getCustomerByEmailId("pql"));


    }
}
