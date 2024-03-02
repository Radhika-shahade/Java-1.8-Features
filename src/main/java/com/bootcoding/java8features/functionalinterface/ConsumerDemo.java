package com.bootcoding.java8features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer<T> is an in-built functional interface introduced in java8.
//It can be used in all contexts where an object needs to be consumed
//i.e taken as input, and some operation is to be performed on the object without returning any result.

public class ConsumerDemo {
//    As we don't need to implement a functional interface or override a method
//    @Override
//    public void accept(Integer t) {
//        System.out.println("printing :"+ t);
//    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> {
            System.out.println("printing :" + t);
        };

        consumer.accept(10);
//As list contains value as foreach accepting consumer functional interface and it calls the accept method
//of consumer interface by giving argument t
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().forEach(consumer);
    }

}
