package pB;

import pA.A;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void displaySquare() {
        System.out.println("Square of a = " + sqr());
    }
}
