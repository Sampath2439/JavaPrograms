package OPPs;

import java.util.Scanner;

public class test {
    public int square(int n){
        return n*n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        test t = new test();
        System.out.println("The Square of "+ n + " is : " + t.square(n));
    }
}
