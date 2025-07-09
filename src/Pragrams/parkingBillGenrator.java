package Pragrams;
import java.util.Scanner;

public class parkingBillGenrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of vehicle (bike/car/truck): ");
        String vehicle = sc.nextLine().toLowerCase();

        int ratePerHour = 0;
        if (vehicle.equals("car")) {
            ratePerHour = 50;
        } else if (vehicle.equals("bike")) {
            ratePerHour = 30;
        } else if (vehicle.equals("truck")) {
            ratePerHour = 100;
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        System.out.println("Enter Arrival Time (in 24-hour format): ");
        int arrivalTime = sc.nextInt();
        System.out.println("Enter Departure Time (in 24-hour format): ");
        int departureTime = sc.nextInt();

        int duration;
        if (departureTime >= arrivalTime) {
            duration = departureTime - arrivalTime;
        } else {
            duration = (24 - arrivalTime) + departureTime;
        }

        int charge = duration * ratePerHour;

        boolean isOvernight = arrivalTime >= 20 || departureTime <= 8;
        if (isOvernight) {
            charge += charge * 0.5;
        }

        System.out.println("Total Parking Charge: " + charge);
    }
}
