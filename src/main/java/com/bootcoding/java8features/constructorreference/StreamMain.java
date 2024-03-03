package com.bootcoding.java8features.constructorreference;


import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14, 24, 565, 76, 46, 46, 778, 99, 89, 6, 899, 799, 76, 543, 123);
        integers.stream().forEach(
            System.out::println
        );
    }
}
