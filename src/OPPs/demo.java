package OPPs;

public class demo {
    public static void main(String[] args) {
     Human h1 = new Human("Sampath",21);
        System.out.println(h1.getName()+"--+"+h1.getAge());
        h1.setName("batchu");
        h1.setAge(22);
        System.out.println(h1.getName()+"--"+h1.getAge());
    }

}
