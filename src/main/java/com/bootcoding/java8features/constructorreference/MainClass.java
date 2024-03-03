package com.bootcoding.java8features.constructorreference;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("learning constructor reference");
        Provider provider = () -> {
            return new Student();
        };
        Student student = provider.getStudent();
        student.display();

//using constructor reference
        Provider provider1 = Student::new;
        Student student1 = provider1.getStudent();
        student.display();
    }
}
