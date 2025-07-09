package Pragrams;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the temperature");
        int temperature = sc.nextInt();

        if(temperature >= 30){
            System.out.println("High");
        } else if (temperature < 30 && temperature >= 10) {
            System.out.println("Normal");
        }else
            System.out.println("Cool");
    }
}
