package Searching;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target = sc.nextInt();

        int[] arr = {1,2,3,4,5,6};

        for (int i =0; i<arr.length; i++){
            if (target == arr[i]){
                System.out.println(i);
            }
        }

    }
}
