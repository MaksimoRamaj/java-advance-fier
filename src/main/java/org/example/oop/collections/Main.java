package org.example.oop.collections;

public class Main {
    public static void main(String[] args) {

       int vlera = myMethod();

       System.out.println(vlera);
    }

    public static int myMethod(){
        return myMethod2() + 5;
    }

    public static int myMethod2(){
        return myMethod3() + 2;
    }

    public static int myMethod3(){
        return 1;
    }
}
