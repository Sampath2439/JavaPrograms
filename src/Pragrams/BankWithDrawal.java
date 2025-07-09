package Pragrams;

import java.util.Scanner;

public class BankWithDrawal {
    public static void main(String[] args) {
        int balance = 10000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amonut to be deducted");

        int withDrawl = sc.nextInt();

        if(balance > withDrawl){
            int reminigBalance = balance - withDrawl;
            System.out.println("You have enough amount to withdrawl");
            System.out.println("Amount to withdrawl is :" + withDrawl);
            System.out.println("Remaning balane in your account is : "+ reminigBalance);
        }
        else
            System.out.println("You are not having sufficent amount to withdraw");


    }
}
