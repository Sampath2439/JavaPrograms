package Pragrams;

import java.util.Scanner;

public class taxiFair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baseFair = 50;
        System.out.println("Enter the distance: ");
        int distance = sc.nextInt();
        double totalfair = 0;
        if(distance <= 2){
            totalfair += baseFair;
            System.out.println(totalfair);
        } else if (distance >3 && distance <=8) {
            totalfair = distance*15 + baseFair;
            System.out.println(totalfair);
        } else if (distance >= 9 && distance < 20) {
            totalfair = distance*10 + baseFair;
            System.out.println(totalfair);

        } else if (distance >= 20) {
            double surcharge;
            totalfair = (distance * 10) + baseFair;

            surcharge = totalfair + totalfair * 0.05;
            System.out.println(surcharge);
        }
    }
}
