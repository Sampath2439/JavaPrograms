package Pragrams;

import java.util.Scanner;

public class canteenSysem {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Welcome to Our Resturent");

        int bill_amount;



        int choice;

        do {

            System.out.println("Enter your choice to eat");
            System.out.println("===============================");
            System.out.println("1. Tea 10 Rupees");
            System.out.println("2. Coffe 15 Rupees");
            System.out.println("3. Samosa 20 Rupees");
            System.out.println("4. Exit");
            System.out.println("===============================");
            choice = sc.nextInt();
            if (choice > 4)
                System.out.println("Invalid Choice");

            switch (choice){
                case 1:
                    System.out.println("You have choosen for tea which costs 10 rupes for one");
                    System.out.println("Enter hoe many tea you need: ");
                    int tea_coun = sc.nextInt();

                    System.out.println("You ordered for " +tea_coun +" tea");

                    if(tea_coun <= 0){
                        System.out.println("Enter a Valid number");
                    }
                    int tea_amount = tea_coun * 10;
                    System.out.println("Total cost of "+ tea_coun + " is " + tea_amount);
                    break;

                case 2:
                    System.out.println("You have choosen for coffee which costs 15 rupes for one");
                    System.out.println("Enter hoe many coffee you need: ");
                    int cofee_coun = sc.nextInt();

                    System.out.println("You ordered for " +cofee_coun +" tea");
                    if(cofee_coun <= 0){
                        System.out.println("Enter a Valid number");
                    }
                    int coffee_amount = cofee_coun * 10;
                    System.out.println("Total cost of "+ cofee_coun + " is " + coffee_amount);
                    break;

                case 3:
                    System.out.println("You have choosen for Samosa which costs 20 rupes for one");
                    System.out.println("Enter hoe many Samosa you need: ");
                    int samosa_coun = sc.nextInt();

                    System.out.println("You ordered for " +samosa_coun +" tea");

                    if(samosa_coun <= 0){
                        System.out.println("Enter a Valid number");
                    }
                    int samosa_amount = samosa_coun * 10;
                    System.out.println("Total cost of "+ samosa_coun + " is " + samosa_amount);
                    break;

                case 4:
                    System.out.println("Thank you for shoping with us");
                    break;


            }
        }while (choice != 4);

    }
}
