package com.java.fundamentals;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productPrice;
        System.out.println("Enter productPrice: ");
        productPrice = sc.nextInt();

        float discountPercentage;
        System.out.println("Enter discountPercentage: ");
        discountPercentage =sc.nextFloat();
        float discountAmount = productPrice * (discountPercentage/100);
        System.out.println("discountamount: " +discountAmount);
        double discountPrice = productPrice - (productPrice*(discountPercentage/100));
        System.out.println("discountPrice: " +discountPrice);
        final float STATE_TAX_PERCENTAGE = 2.5F;
        final float CENTRAL_TAX_PERCENTAGE = 2.5F;
        double STATE_TAX_Amount = discountPrice * (STATE_TAX_PERCENTAGE / 100);
        System.out.println("STATE_TAX_AMOUNT: " + STATE_TAX_Amount);
        double CENTRAL_TAX_Amount = discountPrice * (STATE_TAX_PERCENTAGE / 100);
        System.out.println("CENTRAL_TAX_AMOUNT: "+CENTRAL_TAX_Amount);
        double productTotalPrice = discountPrice + (STATE_TAX_Amount + CENTRAL_TAX_Amount);
        System.out.println("productTotalPrice: " +productTotalPrice);
        byte quantity;
        System.out.println("Enter quantity: ");
        quantity = sc.nextByte();
        double eachProductPrice =  productTotalPrice;
        System.out.println("eachProductPrice: "+eachProductPrice);
        double finalBill = eachProductPrice *quantity;
        System.out.println("finalBill: "+finalBill);
        double totalSaved = discountAmount*quantity;
        System.out.println("totalSaved: "+totalSaved);








    }
}
