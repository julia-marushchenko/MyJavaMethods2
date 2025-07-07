//Java program to demonstrate java methods

package com.methods;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Calling method
        Main.method();

        // Calling method1
        new Main().method1();
    }

    // Static method
    public static void method(){
        System.out.println("I am static method");
    }

    // Non-static method1
    public void method1(){
        System.out.println("I am non-static method");
    }
}