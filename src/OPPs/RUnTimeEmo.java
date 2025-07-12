package OPPs;

import java.util.Date;

public class RUnTimeEmo {
//    protected void finalize(){
//        System.out.println("Garbage collector class finalize method");
//    }
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory of the heap " + r.totalMemory());
        System.out.println("Free memory of the heap "+r.freeMemory());
        long occupiedMemory = r.totalMemory() - r.freeMemory();
        System.out.println("Occupird mrmory :" + occupiedMemory);

        for(int i =0; i<10000;i++){
            Date d= new Date();
            d = null;
        }
        System.out.println("Free memory of the heap "+r.freeMemory());
        occupiedMemory = r.totalMemory() - r.freeMemory();
        System.out.println("Occupird mrmory :" + occupiedMemory);
        r.gc();
        System.out.println("Free memory of the heap "+r.freeMemory());
        occupiedMemory = r.totalMemory() - r.freeMemory();
        System.out.println("Occupird mrmory :" + occupiedMemory);

    }
}
