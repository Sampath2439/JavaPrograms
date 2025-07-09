package Pragrams;

import java.util.Scanner;

public class positiveNumber {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
       int num = sc.nextInt();

       if(num == 0){
           System.out.println("The provided Number is Zero");
       } else if (num < 0) {
           System.out.println("It is a Negative Number");
       }else{
           System.out.println("The number is Positve One");
       }
    }
}
