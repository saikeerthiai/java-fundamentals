import java.util.Scanner;

public class MembershipSwitchDemo {
    public static void main(String[] args) {
        int discountPercentage;
        short shippingCharges;
        char membership;
        double productPrice;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter  membership: S, G, D: ");
        membership = sc.next().charAt(0);

        System.out.println("Enter ProductPrice: ");
        productPrice = sc.nextDouble();
        System.out.println("Productprice: "+productPrice);
        switch(membership){
            case 'S':
                discountPercentage = 10;
                shippingCharges = 50;
                break;

            case 'G':
                discountPercentage = 15;
                shippingCharges = 20;
                break;

            case 'D':
                discountPercentage = 20;
                shippingCharges = 20;
                break;

            default:
                discountPercentage = 0;
                shippingCharges = 100;



        }
        double discount_Amount = productPrice * (discountPercentage / 100.0);
        System.out.println("discount_Amount: "+discount_Amount);
        double priceAfterDiscount = productPrice - discount_Amount;
        System.out.println("priceAfterDiscount: "+priceAfterDiscount);
        System.out.println("discount percentage: "+discountPercentage);
        System.out.println("Shipping charge: "+shippingCharges);
        double Total_Price = priceAfterDiscount + shippingCharges;
        System.out.println("Total  price: "+Total_Price);


    }


}
