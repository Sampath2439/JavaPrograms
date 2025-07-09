package Pragrams;

public class whileTest {
    public static void main(String[] args) throws InterruptedException{
//        int a = 10, b= 20;
        int time = 20;
        while (time >= 0){
            System.out.println("Time reminig : " + time);
            Thread.sleep((1000));
            time--;

        }
//        System.out.println("sampth");
//    do {
//        System.out.println("HI");
//    }while (a<b);
//        int n= 4;
//
//        do {
//            System.out.println("Sam");
//
//        }while (n != 4);
//        System.out.println("HI");
    }
}
