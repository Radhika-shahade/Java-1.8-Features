package com.bootcoding.java8features.lambadaexpression;

import com.bootcoding.java8features.functionalinterface.Calculator;

//    ()-> {body}
public class CalculatorImpl {
    // Method to perform an operation using a functional interface
    private static double performOperation(Calculator operation, int a, int b) {

        return operation.calculate(a,b);
    }
        public static void main(String[] args) {
            // Lambda expressions for different operations
           Calculator addition = (a, b) -> a + b;
            Calculator subtraction = (a, b) -> a - b;
            Calculator multiplication = (a, b) -> a * b;
            Calculator division = (a, b) -> {
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            };

            // Perform operations using lambda expressions
            System.out.println("Addition: " + performOperation(addition, 10, 5));
            System.out.println("Subtraction: " + performOperation(subtraction, 10, 5));
            System.out.println("Multiplication: " + performOperation(multiplication, 10, 5));
            System.out.println("Division: " + performOperation(division, 10, 5));
        }


}


