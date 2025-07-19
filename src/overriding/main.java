package overriding;

public class main {
    public static void main(String[] args) {
//        parent p1 = new parent();
//        p1.property();
//        p1.marry();
//        child c1= new child();
//        c1.property();;
//        c1.marry();
        // dynamic method dispatcher
        parent p2 = new child();
        p2.property();
        p2.marry();
    }
}
