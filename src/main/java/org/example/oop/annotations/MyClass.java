package org.example.oop.annotations;


@Author(name = "Maksi")
public class MyClass {

    public static void main(String[] args) {

        int a = sum(5,6);

        System.out.println(a);
    }


    @Deprecated
    public static int sum(int a,int b){
        return a+b;
    }

    public static void sum(){
        return;
    }
}
