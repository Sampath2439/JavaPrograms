package Pragrams;

import java.util.Scanner;

public class wishMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an hour in 24 Hours format");

        int hour = sc.nextInt();

        if(hour >= 0 && hour < 12){
            System.out.println("Good Morning");
        } else if(hour >= 12 && hour < 16){
            System.out.println("Good Afternoon");
        } else if(hour >= 16 && hour < 21){
            System.out.println("Good Evening");
        } else if(hour >= 21 && hour <= 23){
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid Hour");
        }

    }
}
