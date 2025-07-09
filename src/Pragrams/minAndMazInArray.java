package Pragrams;

import java.util.Scanner;

public class minAndMazInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        for (int i =0; i<arr_size; i++){
            System.out.println("Enter the "+i+" th position element");
            arr[i] = sc.nextInt();
        }

       for (int i = arr_size - 1; i >=0; i--){
           int max_element = arr[0];
           int min_element = arr[arr_size - 1];
           System.out.println(max_element);
           System.out.println(min_element);
       }

        int max_element = arr[0];
        int min_element = arr[0];


        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }
            if (arr[i] < min_element) {
                min_element = arr[i];
            }

            
        }

        System.out.println("Maximum element: " + max_element);
        System.out.println("Minimum element: " + min_element);

    }
}
