package Pragrams;

import java.util.Scanner;

public class MobiletalkTimePlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your talk time preferences in minutes");
        int minutes = sc.nextInt();

        if(minutes < 100){
            System.out.println("You are eligle for basic plan");
        } else if (minutes < 300) {
            System.out.println("You are eligle for standard plan");
        } else if (minutes < 500) {
            System.out.println("YOu are eligle for Premium plan");
        }
        else
            System.out.println("YOu are eligle for Unlimited plan");


    }
}
