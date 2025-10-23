package pB;

import pA.A;

public class C extends A {
    public void show() {
        setA(15);
        System.out.println("Value of a in C = " + getA());
    }
}
