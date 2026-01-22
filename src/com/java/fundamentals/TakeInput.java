package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte footwearSize, jewelleryLengthSize, clothingSize,quantity,exchange;
        System.out.println("Enter footwearSize: ");
        footwearSize = sc.nextByte();
        System.out.println("Enter jewelleryLengthSize: ");
       // System.out.println("jewelleryLengthSize:");
        jewelleryLengthSize = sc.nextByte();
        System.out.println("Enter clothingSize: ");
        clothingSize = sc.nextByte();
        System.out.println("Enter quantity: ");
        quantity = sc.nextByte();
        System.out.println("Enter  exchange: ");
        exchange = sc.nextByte();
        short  atmPin, washRange, expiryYear, manufacturingYear;
        //System.out.println("Enter pinCode: ");
       // pinCode = sc.nextShort();
        System.out.println("Enter atmPin: ");
        atmPin = sc.nextShort();
        System.out.println("Enter washRange: ");
        washRange = sc.nextShort();
        System.out.println("Enter expiryYear: ");
        expiryYear = sc.nextShort();
        System.out.println("Enter manufacturingYear: ");
        manufacturingYear = sc.nextShort();
        int jewelleryPrice, visitedProduct, furnituresPrice, usedProduct, Likes, disLikes;
        System.out.println("Enter jewelleryPrice: ");
        jewelleryPrice = sc.nextInt();
        System.out.println("Enter visitedProduct: ");
        visitedProduct = sc.nextInt();
        System.out.println("Enter furnituresPrice: ");
        furnituresPrice = sc.nextInt();
        System.out.println("Enter usedProduct: ");
        usedProduct = sc.nextInt();
        System.out.println("Enter Likes : ");
        Likes = sc.nextInt();
        System.out.println("Enter disLikes: ");
        disLikes = sc.nextInt();
        long userId, atmAccountNumber, appDownload, customerCareNumber, trendData;
        System.out.println("Enter userId: ");
        userId = sc.nextLong();
        System.out.println("Enter atmAccountNumber : ");
        atmAccountNumber = sc.nextLong();
        System.out.println("Enter  appDownload: ");
        appDownload = sc.nextLong();
        System.out.println("Enter customerCareNumber: ");
        customerCareNumber = sc.nextLong();
        System.out.println("Enter trendData: ");
        trendData = sc.nextLong();
        float productRating, appRating, volume, gst;
        System.out.println("Enter  productRating: ");
        productRating = sc.nextFloat();
        System.out.println("Enter appRating: ");
        appRating = sc.nextFloat();
        System.out.println("Enter volume : ");
        volume = sc.nextFloat();
        System.out.println("Enter gst : ");
        gst = sc.nextFloat();
        double totalprice, rewardsPoint, youSaved;
        System.out.println("Enter totalprice : ");
        totalprice = sc.nextDouble();
        System.out.println("Enter rewardsPoint : ");
        rewardsPoint = sc.nextDouble();
        System.out.println("Enter youSaved : ");
        youSaved = sc.nextDouble();
        System.out.println("\n--- Ajio WebSite ---");
       // System.out.println("footwearSize: " + footwearSize);






        sc.close();

    }
}
