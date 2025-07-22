package overriding;

public class Rectange extends Figure{
    Rectange(double a, double b){
        super(a,b);
    }
    public double area(){
        System.out.println("Inside area for rectange");
        return dim1 * dim2;
    }
}
