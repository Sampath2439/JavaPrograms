package OPPs;
// is it possible to print some thing to the console without using main method.
// yes it is possible up to java 1.6 version after that we cannot print any thing.


public class staticBlock {
    static {
        System.out.println("Hello");
        System.exit(0);
    }
// the above snippet is valid up to java version 1.6 above that we cannot print any thing we must use main method.

    public static void wish(){
        System.out.println("Sampath");
    }
    public static void main(String[] args) {

    }
}
