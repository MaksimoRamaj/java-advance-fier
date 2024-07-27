package org.example.oop.exceptions;

public class ExceptionsExample {
    //finally ekzekutohet pavarsisht return
    static int A(){

        try {
            return 5;
        }catch (Exception e){
            System.out.println("A exception!");
        }finally {
            System.out.println("Brenda bllokut finally te A");
        }
        return 0;
    }

    static void B(){
        try {
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Brenda bllokut finally te B");
        }
    }

    static void C(){
        try {
            throw new IndexOutOfBoundsException();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Brenda bllokut finally te C");
        }
    }

    public static void main(String[] args) {

        A();
        B();
        C();


    }
}
