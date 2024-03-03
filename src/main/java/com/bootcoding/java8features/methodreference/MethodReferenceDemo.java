package com.bootcoding.java8features.methodreference;
//method references are special type of lambda expressions
//They are often used to create simple lambda expression by referencing existing method
//each time when you are using lambda expression to just referring a method, you can replace your lambda expression
//with method reference
//*Types of method references*
//static method,instance method , constructor
public class MethodReferenceDemo {
    public static void main(String[] args) {
        System.out.println("learning method reference");

//        provide the implementation of work
        Work work = ()->{
            System.out.println("new task is executing ");};
        work.doTask();

//        using method reference
//        referring static method
        Work work1 =Stuff::doStuff;
         work1.doTask();

//         Runnable runnable =Stuff::threadTask;
//         Thread thread =new Thread(runnable);
//         thread.start();

//         referring non-static method
         Stuff obj= new Stuff();
         Runnable runnable1 = obj ::printNumber;
         Thread thread1 = new Thread(runnable1);
         thread1.start();
    }

}
