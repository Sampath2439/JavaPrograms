package Pragrams;

import java.util.Scanner;

public class testCharge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (bike/truck/car)");
        String Vehicle  = sc.nextLine().toLowerCase();

        int ratePerhour = 0;
        if(Vehicle.equals("Car")){
            ratePerhour = 50;
        } else if (Vehicle.equals("bike")) {
            ratePerhour = 30;
        } else if (Vehicle.equals("Truck")){
            ratePerhour = 100;
        }

        System.out.println("Enter the arrival time in 24 hours format");
        int arrivalTime = sc.nextInt();

        System.out.println("Enter the departure time in 24 hours format");
        int detartureTime = sc.nextInt();

        int duration;

        if (detartureTime >= arrivalTime){
            duration = arrivalTime - detartureTime;
        }else {
            duration = (24 - arrivalTime) + detartureTime;
        }

        int charge = duration *ratePerhour;



    }
}
