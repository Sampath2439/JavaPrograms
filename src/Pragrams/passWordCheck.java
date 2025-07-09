package Pragrams;

import java.util.Scanner;

public class passWordCheck {
    public static void main(String[] args) {
        int password = 1234;
        Scanner sc = new Scanner(System.in);


        int attemptCount = 1;



        while (attemptCount <= 3){
            System.out.println("Enter yore Password :");
            int suerPassword = sc.nextInt();

            if (password != suerPassword) {
                System.out.println("Incoorect password please type correct password : ");
            }else{
                System.out.println("Sucessfully Logedin");
            }
            attemptCount++;
        }

        System.out.println("Too many attempts");
    }

}
