package org.example.oop.interfaces.example3;

public class MyTest implements MySecondInterface{


    public void myDefaultMethod(){
        System.out.println("Inside myDefault overriden interface method");
    }

    @Override
    public void myMethod() {
        System.out.println("Overriding from interface");
    }

    @Override
    public void mySecondInterfaceMethod() {
        System.out.println("Overriding from interface");
    }
}
