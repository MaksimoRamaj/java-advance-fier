package org.example.oop.exceptions;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
//Rasti 1
//        int a = 5;
//        int b = 2;
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println("0");
//            b = 1;
//        }
//
//        System.out.println("Vlera e b: " + b);

        //Rasti 2

        Random random = new Random();

        int arr[] = {1, 2, 3};
        int a = 5;
        int b = random.nextInt(-2, 2);

        try {

            System.out.println("B: " + b);
            System.out.println(a / b);
            try {
                arr[5] = 2;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Message: " + e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Kodi pas try-catch");

        try {
            System.out.println("Rezultati: " + myMethod(5,-5));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }



    //Rasti 3


 public static int myMethod(int a, int b) {
        if(b < 0){
           throw new ArithmeticException("Parametri b nuk mund te jete negativ!");
        }
        return a+b;
 }

}
