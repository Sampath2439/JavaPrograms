package Pragrams;

import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        for (int i =0; i<arr_size; i++){
            System.out.println("Enter the "+i+" th position element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = arr_size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }




    }
}
