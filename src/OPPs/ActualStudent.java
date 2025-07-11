package OPPs;

public class ActualStudent {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo();
        int[] marks = {90,80,60};
        StudentDemo s2 = new StudentDemo("Sampath",101,marks);
        System.out.println("Student1 Details");
        s1.DispalyDetails();
        System.out.println("Total marks : "+  s1.calculateTotal());
        System.out.println("Average marks : " +  s1.calculateAverage());

        System.out.println("Student 2 Details");
        s2.DispalyDetails();
        System.out.println("Total marks : "+  s2.calculateTotal());
        System.out.println("Average marks : " +  s2.calculateAverage());

    }
}