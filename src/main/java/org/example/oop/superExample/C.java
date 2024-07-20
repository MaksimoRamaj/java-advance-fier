package org.example.oop.superExample;

public class C extends B{
    int c;

    public C() {
        super();
        System.out.println("Inside C");
    }

    public C(int b, int c) {
        super(b);
        this.c = c;
    }

    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

}
