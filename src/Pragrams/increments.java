package Pragrams;

public class increments {
    public static void main(String[] args) {

        int a =10;
        int b = a % 4;
        int c = b++;
        System.out.println(c);
        a = (a--) + (++b);

        System.out.println(a);

        b = (b--) - (--c) - (c = a );

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a + c);
        System.out.println(a*c);
    }
}
