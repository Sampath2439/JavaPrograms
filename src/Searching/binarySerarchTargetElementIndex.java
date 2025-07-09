package Searching;

import java.util.Scanner;

public class binarySerarchTargetElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c =0;
        for (int i =0; i<n;i++){
            if(target == arr[i]){
                System.out.println(i);
                c++;
            }
        }
        if(c==0){
            System.out.println(-1);
        }
    }
}
