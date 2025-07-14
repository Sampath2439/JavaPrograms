package Pragrams;

import java.util.Scanner;

public class CountOfDigitsUsingRecursion {
    public static int digitCount(int n){
        if (n == 0)
            return 0;

        return 1 + digitCount(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = digitCount(num);
        System.out.println(result);

    }

}
