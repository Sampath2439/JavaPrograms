package OPPs;

public class carDemo {
    public static void main(String[] args) {
        carRentalSystem c1 = new carRentalSystem("Model Y",2021);
        System.out.println(c1.getModel() +"--"+c1.getYear());
        c1.setModel("Model X");
        c1.setYear(2022);
        System.out.println(c1.getModel() +"--"+c1.getYear());

    }
}
