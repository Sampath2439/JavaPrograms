package OPPs;

public class areaCalculator {
    //instance methods
    public double rectangleArea(double length, double width){
        return length * width;
    }

    public double circleAre(double radius){
        return 3.14 * (radius * radius);
    }

    public double sqaureArea(double side){
        return side * side;
    }
    // static methods
    static double triangleArea(double base, double height){
        return 0.5 * base * height;
    }

    static double trepizoidArea(double base1, double base2, double height){
        return 0.5 * (base1 + base2) * height;
    }

    static double parallogramArea(double height, double width){
        return height * width;
    }


    public static void main(String[] args) {
        areaCalculator area = new areaCalculator();
        System.out.println("Are of rectange is : "+area.rectangleArea(10,5));
        System.out.println("Area of circle is : " + area.circleAre(7));
        System.out.println("Area of Square is : " + area.sqaureArea(4));

        //static methods
        System.out.println("Area of triangle is : " + areaCalculator.triangleArea(10,5));
        System.out.println("Area of trepizoid is : " + areaCalculator.trepizoidArea(25,20,5));
        System.out.println("The area pf parallogram is : "+areaCalculator.parallogramArea(5,10));
    }
}
