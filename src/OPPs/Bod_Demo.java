package OPPs;

public class Bod_Demo {
    public static void main(String[] args) {
        Box mybox = new Box(10.0,25.0,55.0);
        mybox.display();
        System.out.println("The volume is:" + mybox.volume());
    }
}
