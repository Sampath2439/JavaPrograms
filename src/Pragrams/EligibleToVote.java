package Pragrams;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age : ");

        int age = sc.nextByte();

        if (age >= 18){
            System.out.println("You are a major, Elible for vote");
        }
        else
            System.out.println("Not a major, not eligible to vota");
    }
}
