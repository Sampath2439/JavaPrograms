package Pragrams;

import java.util.Scanner;

public class AtmExample {
    public static void main(String[] args) {
        int PinNumber = 45849;
        int remning_balance = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your pIn NUmber :");

        int enteredPin = sc.nextInt();

        if(enteredPin != PinNumber)
            System.out.println("Your Pin is Incorrect");


        int choice;
        int balance = 15488;
        do{
            System.out.println("=========================");
            System.out.print("Enter to ATM Machine");
            System.out.println("=========================");

            System.out.println("Enter the operation to be performed :");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdrawl");
            System.out.println("3. Deposite");
            System.out.println("4. Exit");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your balane is :" + balance);
                    break;
                case 2:
                    System.out.println("Enter the amout to withdraw :");
                    int widrawl = sc.nextInt();

                    if(widrawl > balance){
                        System.out.println("Out of balance");
                    }

                    if (widrawl < 500){
                        System.out.println("Enter the amount grater than 500");
                    }else {
                        if (widrawl%100 != 0){
                            System.out.println("Please withdraw the amount in multiples of 100");
                        }
                    }
                    remning_balance  = balance - widrawl;
                    System.out.println("Withdrawn :" + widrawl + " Sucessfully");
                    System.out.println("Your remingn balane :" + remning_balance);
                    break;

                case 3:
                    System.out.println("Enter the amout to be deposited :");
                    int deposite = sc.nextInt();

                    int updatedBalance =  remning_balance + deposite;
                    System.out.println("Your total balance is: " + updatedBalance);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
            }
        }while (choice != 4);


    }


}
