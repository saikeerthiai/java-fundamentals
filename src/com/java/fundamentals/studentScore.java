package com.java.fundamentals;

import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte mathMarks, socialMarks, scienceMarks, teluguMarks,hindiMarks,englishMarks;
        System.out.println("Enter mathMarks: ");
        mathMarks  = sc.nextByte();
        System.out.println("Enter socialMarks: ");
        socialMarks = sc.nextByte();
        System.out.println("Enter scienceMarks: ");
        scienceMarks = sc.nextByte();
        System.out.println("Enter teluguMarks: ");
        teluguMarks = sc.nextByte();
        System.out.println("Enter hindiMarks: ");
        hindiMarks = sc.nextByte();
        System.out.println("Enter englishMarks: ");
        englishMarks = sc.nextByte();
        float totalMarks;
        totalMarks = (float)(mathMarks + socialMarks + scienceMarks + teluguMarks + hindiMarks + englishMarks);
        System.out.println("totalMarks: "+totalMarks);
        float average;
        average = totalMarks/6;
        System.out.println("average: "+average);



        sc.close();
    }



}
