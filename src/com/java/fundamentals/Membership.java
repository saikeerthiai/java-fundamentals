package com.java.fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Membership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char membership;
        System.out.println("Enter  membership: S, G, D: ");
        membership = sc.next().charAt(0);
        double productPrice;
        System.out.println("Enter ProductPrice: ");
        productPrice = sc.nextDouble();
        System.out.println("Productprice: "+productPrice);

        final float Central_Tax = 2.5F;
        final float State_Tax =2.5F;
        float FinalTax = Central_Tax + State_Tax;
        System.out.println("Final Tax: "+FinalTax);



        if (membership == 'S' || membership == 's') {
            int discount_Percentage = 10;
            int shippingCharge = 50;
            double discount_Amount = productPrice * (discount_Percentage / 100.0);
            System.out.println("discount_Amount: "+discount_Amount);
            double discount = productPrice - discount_Amount;
            System.out.println("discount: "+discount);
            double SliverTotal_Price = discount  +FinalTax + shippingCharge;
            System.out.println("Total Sliver price: "+SliverTotal_Price);

        } else if (membership == 'G' || membership == 'g') {
            int discount_Percentage = 15;
            int shippingCharge = 20;
            double discount_Amount = productPrice * (discount_Percentage / 100.0);
            System.out.println("discount_Amount: "+discount_Amount);
            double discount = productPrice - discount_Amount;
            System.out.println("discount: "+discount);
            double GoldTotal_Price = discount  +FinalTax + shippingCharge;
            System.out.println("Total Sliver price: "+GoldTotal_Price);



        } else if (membership == 'D' || membership == 'd') {
             int discount_Percentage = 20;
            int shippingCharge = 20;
            double discount_Amount = productPrice * (discount_Percentage / 100.0);
            System.out.println("discount_Amount: "+discount_Amount);
            double discount = productPrice - discount_Amount;
            System.out.println("discount: "+discount);
            double DiamondTotal_Price = discount  +FinalTax + shippingCharge;
            System.out.println("Total Sliver price: "+DiamondTotal_Price);

        } else {
            System.out.println("--No Option--");
        }

        sc.close();
    }
}
