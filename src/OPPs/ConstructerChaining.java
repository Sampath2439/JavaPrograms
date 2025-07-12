package OPPs;

public class ConstructerChaining {
    String name;
    int id;
    String email;

    public ConstructerChaining(){
        System.out.println("No - Args Constructor");
    }

    public ConstructerChaining(int id, String name){
        this(); // this 2 arug constuctor calls the no-org cinstructor
        this.id = id;
        this.name = name;
        System.out.println("2 parameters");
    }

    public ConstructerChaining(int id, String name,String email) {
        this(0,""); // this line 3 parameter constructor called the 2 parameter constructor
        this.name = name;
        this.id  = id;
        this.email = email;
        System.out.println("3 parameter constructor");
    }

    public static void main(String[] args) {
        ConstructerChaining p1 = new ConstructerChaining(101,"Sampath","sam@gmail.com");

    }
}
