package overriding;

public class shapeCalculator {
    public static void main(String[] args) {
     shape s = new shape();
     cube c = new cube();
     cuboid cb = new cuboid();
     s.calculateVolume();
     c.calculateVolume();
     s.calculateVolume();
     cb.calculateVolume();
    }
}
