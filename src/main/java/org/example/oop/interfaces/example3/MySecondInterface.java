package org.example.oop.interfaces.example3;

public interface MySecondInterface extends MyInterface{

    default void testMethod(){};
    default int testMethod2(){
        return 0;
    }

    void mySecondInterfaceMethod();

    default void myDefaultMethod(){
        System.out.println("Inside myDefault interface method");
        myPrivateMethod();
    }

    private void myPrivateMethod(){
        System.out.println("Inside my private method!");
    }

    static void mySecondStaticMethod(){
        myStaticMethod("ABC");
    }

    static void myStaticMethod(String myString){
        System.out.println("My static method of interface!" + myString);
        return;
    }
}
