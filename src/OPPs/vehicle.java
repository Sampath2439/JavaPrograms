package OPPs;

public class vehicle {
    String Brand;
    public vehicle(){
        System.out.println("Vehicle Default constructor");
    }
    public vehicle(String Brand){
        this.Brand = Brand;
        System.out.println("Vehicle Brand set to : "+this.Brand);
    }
}
