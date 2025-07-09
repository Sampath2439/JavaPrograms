package Pragrams;

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units showing on the meter : ");
        int units = sc.nextInt();

        double billAmount  = 0;
        System.out.println("Are you a Senior Citizen (true/false) : ");
        boolean isSeniorCitizen = sc.hasNextBoolean();

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = (100 * 1.5) + ((units - 100) * 2.0);
        } else if (units <= 300) {
            billAmount = (100 * 1.5) + (100 * 2.0) + ((units - 200) * 3.0);
        } else {
            billAmount = (100 * 1.5) + (100 * 2.0) + (100 * 3.0) + ((units - 300) * 5.0);
        }


        double surCharge = 0;
        if(billAmount >= 1000){
            surCharge = (billAmount * 0.1);
        }

        double discout = 0;




        if(isSeniorCitizen){
            discout = (billAmount - surCharge) *0.05;
        }

        double totalBill = billAmount + surCharge - discout;

        System.out.println("Your Units : " +units);
        System.out.println("Your Amount before discount : " +billAmount);
        System.out.println("Your discount : " +discout);
        System.out.println("Your Surcharge : " +surCharge);
        System.out.println("Your total Bill : " +totalBill);

    }
}
