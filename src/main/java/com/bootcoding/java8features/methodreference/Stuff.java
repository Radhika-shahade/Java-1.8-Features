package com.bootcoding.java8features.methodreference;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff()
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("I am doing task");
    }
    public static void threadTask()  {
        for(int i=1;i<=10;i++)
        {
            System.out.println(2*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public  void printNumber()  {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
