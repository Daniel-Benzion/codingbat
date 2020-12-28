package com.codingbat;

/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */

public class HelloName {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {

        HelloName helloName = new HelloName();
        System.out.println("Expected Hello Bob! -> returned: " + helloName.helloName("Bob"));
        System.out.println("Expected Hello Alice! -> returned: " + helloName.helloName("Alice"));
        System.out.println("Expected Hello X! -> returned: " + helloName.helloName("X"));
    }
}