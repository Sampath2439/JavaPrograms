package Pragrams;

import java.util.Scanner;

public class avgArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        for (int i =0; i<arr_size; i++){
            System.out.println("Enter the "+i+" th position element");
            arr[i] = sc.nextInt();
        }

        int arr_sum = 0;

        for (int j : arr) {
            arr_sum += j;
        }

        System.out.println("Average is: "+arr_sum/arr_size);

    }
}
