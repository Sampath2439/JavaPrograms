package OPPs;

public class GCDemo {
    protected void finalize(){
        System.out.println("Garbage collector class finalize method");
    }
    public static void main(String[] args) {
        GCDemo d = new GCDemo(); // here object is eligible for gc
        d= null;
        System.out.println("Requesting JVM to run gc by using system class");
        System.gc();
        System.out.println("End of the main method");
    }
}
