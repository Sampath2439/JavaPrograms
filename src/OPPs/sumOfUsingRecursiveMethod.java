package OPPs;

import java.util.Scanner;

public class sumOfUsingRecursiveMethod {
    public static int digitSum(int n){
        if (n == 0)
            return 0;

        return (n % 10) + digitSum(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int result = digitSum(num);
        System.out.println(result);

    }
}
