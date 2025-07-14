package Pragrams;

import java.util.Scanner;

public class FibonaciSeriesUsingRecursion {
    public static int Fibo(int n){
        if (n <= 1)
            return n;

        return Fibo(n-1) + Fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            System.out.print(Fibo(i) + ",");
        }
    }
}
