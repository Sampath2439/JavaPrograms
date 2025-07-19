package OPPs;

public class Car extends vehicle{
    int year;
    Car(){
        this("unknonw",2020);
        System.out.println("Car default Constructor");
    }
    Car(String brand, int year){
        super(brand);
        this.year = year;
        System.out.println("CAr Year is set to : "+this.year);
    }
}
