package com.java.fundamentals;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1: ");
        int no1 = sc.nextInt();
        System.out.println("Enter no2: ");
        int no2 = sc.nextInt();
        int res = no1++ - --no2 + no2-- * ++no1 + --no1;
        int res2 = no1 + (no2-30) * 40 / 50 %60;
        int res3 = no1 + no2 - 30 * 40 / 50 %60;
       // boolean res4 = no1++ > 10 && ++no1 >5;
        //System.out.println(no1++ > 10 && ++no1 >5);
        System.out.println("no1: "+no1);
        System.out.println("no2: "+no2);
        System.out.println("res: "+res);
        System.out.println("res: "+res2);
        System.out.println("res: "+res3);
        //System.out.println("res: "+res4);
        sc.close();
    }
}
