package OPPs;

public class sportsCar extends  Car{
    int maxSpeed;
    sportsCar(){
        this("Ferrari",2023,350);
        System.out.println("sports car defualt constructor");
    }
    sportsCar(String brand, int year, int maxSpeed){
        super(brand,year);
            this.maxSpeed = maxSpeed;
        System.out.println("Sportscar max speed is set to : "+this.maxSpeed);
    }

}
