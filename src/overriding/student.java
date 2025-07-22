package overriding;

public class student {
    String name;
    int rollNo;

    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public static void main(String[] args) {
        student s1 = new student("Sampath",102);
        student s2= new student("Batchu",103);
        student s3 = new student("Sampath",102);
        student s4 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
    //s1.eqauls(s2)
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof student) {
            student s2 = (student) obj;
            if (name.equals(s2.name) && rollNo == s2.rollNo) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
