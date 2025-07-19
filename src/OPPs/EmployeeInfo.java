package OPPs;

import java.util.Scanner;

public class EmployeeInfo extends Employee1{
    double salaryPerYear;
    EmployeeInfo(){
        super("","",0);
    }
    public void inputEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name: ");
        String employeeeName = sc.next();
        
        System.out.println("Ente the Employee Designation: ");
        String designation = sc.next();

        System.out.println("Entet year of Experience: ");
        int yearsofExperience = sc.nextInt();

        System.out.println("Entet the salary per year: ");
        int salary = sc.nextInt();
        
        sc.close();
    }
    
    public void displayDetails(){
        System.out.println("Employee name :" +employeeName);
        System.out.println("Emplouee Designation :" +designation);
        System.out.println("year of experence: " +yearsofExperience);
        System.out.println("Slary per year: " +salaryPerYear);
    }
    
    public void claculateSalary(){
        double totalSalary = salaryPerYear * yearsofExperience;
        System.out.println("Total,Salary is: "+totalSalary);
    }
    
}
