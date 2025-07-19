package OPPs;

public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }else {
            System.out.println("Salary is Negative");
        }
    }

    public void displayEmployeeInfo(){
        System.out.println("The details of the employee ");
        System.out.println(employeeID  +name + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(121,"Sampath",2500.0);
        e1.displayEmployeeInfo();

        e1.setEmployeeID(121);
        e1.setName("Batchu");
        e1.setSalary(200.00);
        e1.displayEmployeeInfo();
    }
}
