package Pragrams;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yor 5 subjects mark details");

        System.out.println("Enter your Marks in maths out of 100 :");
        int mathMraks = sc.nextInt();

        System.out.println("Enter your Marks in Physics out of 100 :");
        int physicsMraks = sc.nextInt();

        System.out.println("Enter your Marks in Chemistry out of 100 :");
        int chemistryMraks = sc.nextInt();

        System.out.println("Enter your Marks in English out of 100 :");
        int englishMraks = sc.nextInt();

        System.out.println("Enter your Marks in Social out of 100 :");
        int socilMraks = sc.nextInt();

        int totalmarks = mathMraks + physicsMraks + chemistryMraks + englishMraks + socilMraks;

        int avgMarks = totalmarks / 5 ;

        if(avgMarks > 90 ){
            System.out.println("Grade A++");
        } else if (avgMarks >= 80) {
            System.out.println("Grade A");
        } else if (avgMarks >= 70) {
            System.out.println("Grade B");
        } else if (avgMarks >= 60) {
            System.out.println("Grade C");
        } else if (avgMarks >= 50) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }

    }
}
