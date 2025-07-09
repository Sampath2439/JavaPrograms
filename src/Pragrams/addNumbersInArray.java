package Pragrams;

import java.util.Scanner;

public class addNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            System.out.println("Enter the value of "+i+" th value");
            arr[i] = sc.nextInt();
        }
        int arr_sum = 0;
        for(int i= 0; i< arr.length; i++){
            arr_sum += arr[i];
        }
        System.out.println("The sum of the array is: ");
        System.out.print(arr_sum);
    }
}
