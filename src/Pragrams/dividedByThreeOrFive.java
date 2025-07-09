package Pragrams;

import java.util.Scanner;

public class dividedByThreeOrFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check");

        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0)
            System.out.println(num + " Is dissible by 3 and 5 at a time");
        else
            System.out.println(num + " Not disvisible by 3 or 5 at a time");
    }
}
