package Pragrams;

import java.util.Scanner;

public class addingElementsInArray {
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i =0; i<size; i++){
            System.out.println("Enter the " + i + " th position data");
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered elements are: ");
        for (int x : arr){
            System.out.println(x);
        }
    }
}
