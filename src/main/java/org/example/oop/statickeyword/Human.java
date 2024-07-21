package org.example.oop.statickeyword;

public class Human {

    private String id;
    private String emri;

    public static int popullsia;

    public Human(String id, String emri) {
        this.id = id;
        this.emri = emri;
        popullsia = popullsia + 1;
    }

    static {
        System.out.println("Brenda bllokut static!");
        Human h1 = new Human("AA","ADFS");
    }

    public void myNonStaticMethod(){
        System.out.println("My nonstatic method!");
    }

    public static void myMethod(){
        System.out.println("My static method!");
    }
}
