package OPPs;

public class constructorOverloading {
    double height;
    double depth;
    double width;
    // parameterised constructor
    public constructorOverloading(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    // no parameterised constructor
    public constructorOverloading(){
        height = -1;
        depth = -1;
        width = -1;
    }
    // parameterised constructor
    public constructorOverloading(double len){
        width = height = depth = len;
    }

    public double volume(){
        return width * height * depth;
    }
    public static void main(String[] args) {
        constructorOverloading co = new constructorOverloading();
        double volume1 = co.volume();
        System.out.println("Volume of MyBox 1 is : "+volume1);

        constructorOverloading co1 = new constructorOverloading(10,2,3);
        double volume2 = co1.volume();
        System.out.println("Volume of MyBox 2 is : "+volume2);

        constructorOverloading co2 = new constructorOverloading(10.0);
        double volume3 = co2.volume();
        System.out.println("Volume of MyBox 3 is : "+volume3);
        //hi

    }
}
