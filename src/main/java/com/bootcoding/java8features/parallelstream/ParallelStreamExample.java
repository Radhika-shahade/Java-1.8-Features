package com.bootcoding.java8features.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
//        long start =0;
//        long end =0;
//        start =System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("stream took time: "+(end-start) );
//
////        order of execution is not same in parallel stream
//        System.out.println("using parallel stream");
//        start =System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("parallel stream took time: "+(end-start) );

        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread: " +Thread.currentThread().getName()+" "+x);
        });
        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread: " +Thread.currentThread().getName()+" "+x);
        });


    }
}
