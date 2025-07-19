package OPPs;

import java.util.Scanner;

public class mainCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        myCalculation clc = new myCalculation(num1, num2);

        int sum= clc.addition();
        int product = clc.multiplication();

        System.out.println(sum);
        System.out.println(product);

    }
}
