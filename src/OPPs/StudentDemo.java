package OPPs;

import java.util.Arrays;

public class StudentDemo {
    String name;
    int rollNumber;
    int[] marks;

    public StudentDemo(){
        name = "Unknown";
        rollNumber = 0;
        marks = new int[]{0, 0, 0};
    }

    public StudentDemo(String name, int rollNumber, int[] marks){
        super();
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[3];
        for(int i = 0;i<3;i++){
            this.marks[i] = marks[i];
        }
    }
    //
//    public StudentDemo (StudentDemo obj){
//
//    }

    public void DispalyDetails(){
        System.out.println("The student name is :"+name);
        System.out.println("Marks of the student is: "+rollNumber);
//      System.out.println(Arrays.toString(marks));
        for (int i =0; i<marks.length;i++){
            System.out.println("Subject" + marks[i]);
        }
    }

    public int calculateTotal(){
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public double calculateAverage(){

        return calculateTotal() / 3.0;
    }

}
