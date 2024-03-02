package com.bootcoding.java8features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
//Before java 8
//    @Override
//    public boolean test(Integer value) {
//        if (value % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
//        PredicateDemo obj = new PredicateDemo();
//        System.out.println(obj.test(4));
        Predicate<Integer> predicate = value -> {
            if (value % 2 == 0) {
                return true;
            } else {
                return false;
            }

        };
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5,8);
//        filter method takes predicate
        list1.stream().filter(predicate).forEach(even-> System.out.println("even numbers:"+ even));
        System.out.println(predicate.test(10));
    }
}
