package com.java.fundamentals;

import java.util.Scanner;

public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number1, number2;
        System.out.println("Enter number1: ");
        number1 = sc.nextByte();
        System.out.println("Enter number2: ");
        number2 = sc. nextByte();

        short res = (short)(number1+number2);
        System.out.println("Enter res: " +res);



        sc.close();
    }
}
