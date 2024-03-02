package com.bootcoding.java8features.streamapi.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap
{
    public static void main(String[] args) {
        List<Customer>customers= CustomerDao.getAll();

//         List<Customer> convert List<String>->Data Transformation
//         Map function is used when we have to do one to one mapping
//         customer -> customer.getEmail() one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

//         customer-> customer.getPhoneNumbers() one to many mapping

        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());

        //      getting phoneNumbers as List of List
//      i.e[[397937955, 21654725], [89563865, 2487238947], [38946328654, 3286487236], [389246829364, 948609467]]
        System.out.println(phoneNumbers);

        //    so in this scenario we should go for flatMap
//         List<Customer> convert List<String>->Data Transformation
//         customer-> customer.getPhoneNumbers() one to many mapping
        List<String> phoneNumbers2 = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers2);
    }
}
