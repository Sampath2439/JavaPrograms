package overriding;

public class Figure {
    double dim1;
    double dim2;
    public Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Area for figure is undefined");
        return 0;
    }

}
