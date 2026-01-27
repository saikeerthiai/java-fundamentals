package com.java.fundamentals;


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
        int discount_Percentage;
        int shippingCharge;


        if (membership == 'S' || membership == 's') {
            discount_Percentage = 10;
            shippingCharge = 50;

        } else if (membership == 'G' || membership == 'g') {
            discount_Percentage = 15;
            shippingCharge = 20;



        } else if (membership == 'D' || membership == 'd') {
             discount_Percentage = 20;
            shippingCharge = 20;

        } else {
            discount_Percentage = 0;
            shippingCharge = 100;
        }
        double discount_Amount = productPrice * (discount_Percentage / 100.0);
        System.out.println("discount_Amount: "+discount_Amount);
        double priceAfterDiscount = productPrice - discount_Amount;
        System.out.println("priceAfterDiscount: "+priceAfterDiscount);
        double SliverTotal_Price = priceAfterDiscount  +FinalTax + shippingCharge;
        System.out.println("Total Sliver price: "+SliverTotal_Price);


        sc.close();
    }
}
