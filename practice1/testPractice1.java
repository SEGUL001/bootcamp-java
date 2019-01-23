package practice1;

import java.util.ArrayList;

public class testPractice1 {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();
        ArrayList<A> array = new ArrayList<A>();
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);

        for (A object : array) {
            System.out.println(object.whoIam());
        }
    }
}
