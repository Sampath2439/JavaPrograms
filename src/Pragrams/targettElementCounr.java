package Pragrams;

import java.util.Scanner;

public class targettElementCounr {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the size :");
        int ar_size = sc.nextInt();

        int[] arr = new int[ar_size];

        for (int i =0; i<ar_size; i++){
            System.out.println("Enter the "+i+" th data: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to get the target count: ");
        int targetElement = sc.nextInt();

        int cont = 0;
        for (int i = 0; i<arr.length;i++){
            if (targetElement == arr[i]){
                cont ++;
            }
        }

        System.out.println("The target element "+targetElement+" count is : "+cont);
    }
}
