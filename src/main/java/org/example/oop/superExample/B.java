package org.example.oop.superExample;

public class B extends A{
    int b;

    public B() {
        super();
        System.out.println("Inside B");
    }

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    public B(int b) {
        super();
        this.b = b;
    }
}
