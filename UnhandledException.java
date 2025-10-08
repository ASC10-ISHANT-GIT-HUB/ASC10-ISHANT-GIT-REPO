package com.demo.exceptions;

public class UnhandledException {
    public static void main(String[] args) {
        int i =100;
        System.out.println("divided by zero");
        int result=i/0;
        System.out.println("Abruptly terminated, so this doesn't execute");
        System.out.println(result);
    }
}
