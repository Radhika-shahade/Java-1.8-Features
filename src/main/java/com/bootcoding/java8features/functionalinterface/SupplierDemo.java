package com.bootcoding.java8features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
//    @Override
//    public String get() {
//        return "hi, good morning";
//    }

    public static void main(String[] args) {
//        SupplierDemo pbj = new SupplierDemo();
//        System.out.println(pbj.get());
       Supplier supplier= ()-> "hello, everyone";

//        System.out.println(supplier.get());
        List<String> list1 = Arrays.asList("a","b");
        System.out.println(list1.stream().findAny().orElseGet(supplier));
    }

}
