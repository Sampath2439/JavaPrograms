package overriding;

import java.util.Scanner;

public class cube extends shape{
    void calculateVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side value of cube : ");
        double side = sc.nextDouble();
        double volume = side * side * side;
        System.out.println();
        System.out.printf("The volume of cube is : %.2f\n",volume);
//        sc.close();
    }
}
