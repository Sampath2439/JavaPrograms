package Pragrams;

import java.util.Scanner;

public class mulOf11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number One");
        int num1 = sc.nextInt();
        System.out.println("Enter Number Two");
        int num2 = sc.nextInt();

        boolean found = false;

        if(num1 > num2)
        {
            System.out.println("Invalid to find because num1 is high");
        }
        else {
            for (int i = num1; i<num2; i++){
                if(i % 11 ==0){
                    System.out.print(i + " ");
                    found = true;
                }

            }

            if(!found){
                System.out.println("Caanot found");
            }
        }








    }
}
