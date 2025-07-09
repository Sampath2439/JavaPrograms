package Pragrams;

import java.util.Scanner;

public class asciiToNmber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a charecter find it's ASCII value : ");

        char letter = sc.next().charAt(0);

        int asciiNum = letter;

        System.out.println(asciiNum);
    }
}
