package overriding;

import java.util.Scanner;

public class cuboid extends shape{
    @Override
    void calculateVolume() {
        Scanner sc = new Scanner(System.in);
        double length, width, height;
        System.out.println("Enter the lenght : ");
        length = sc.nextDouble();

        System.out.println("Enter width : ");
        width = sc.nextDouble();

        System.out.println("Enter height");
        height = sc.nextDouble();

        double area = length * width * height;
        System.out.printf("The area of cuboid is %.2f\n: ",area);

    }
}
