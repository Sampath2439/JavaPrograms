package overriding;

public class findAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,12);
        System.out.println(f.area()); // OP is 0

        Rectange r= new Rectange(10,2);
        System.out.println("Area is :"+r.area()); // reactange area

        Triangle t = new Triangle(10,5);
        System.out.println("Area is :"+t.area());

        //dynamic method dispatch

        Figure fig = new Rectange(30,5);
        System.out.println("Area is "+fig.area());

        Figure fig1 = new Triangle(40,7);
        System.out.println("Area is :"+fig1.area());


    }
}
