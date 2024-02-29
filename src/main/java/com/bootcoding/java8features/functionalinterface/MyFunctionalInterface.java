package com.bootcoding.java8features.functionalinterface;
//The interface which contains only one abstract method but can have multiple default and static methods
//is called Functional interface
//ex. Runnable, callable, comparable, comparator


public interface MyFunctionalInterface {

    void m1();
    default void m2(){
        System.out.println("Default method:m2");
    }

    static void m3()
    {
        System.out.println("Default method:m3");
    }
    public static void main(String[] args) {
        System.out.println("main method is executing");
    }

}
