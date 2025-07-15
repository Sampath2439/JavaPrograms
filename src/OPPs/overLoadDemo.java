package OPPs;

public class overLoadDemo {
    public void test(){
        System.out.println("No parametres");
    }

//    public void test(int a){
//        System.out.println("A value is : "+a);
//    }

    public void test(int a, int b){
        System.out.println("A and B Value is " +a+ " , "+b);
    }

    public double test (double a){
        System.out.println("Square of a is : "+a);
        return a* a;
    }

    public static void main(String[] args) {
        overLoadDemo d1 = new overLoadDemo();
        d1.test(10);
        d1.test();
        d1.test(10,20);
        d1.test(5.0);
    }
}
