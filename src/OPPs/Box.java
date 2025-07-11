package OPPs;

public class Box {
    double height;
    double width;
    double depth;
    Box(double width, double height, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public void display(){
        double volume = width * height * depth;
        System.out.println("Box Dimensions:");
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Length : " + depth);
        System.out.println("Volume : " + volume);
    }
}
