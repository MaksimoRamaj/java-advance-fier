package org.example.oop.exceptions.CustomException;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Jep numrin");

        int numri = new Scanner(System.in).nextInt();

        try {isOdd(numri);}
         catch (NumberOddException e){
            System.out.println(e.getMessage());
         }
    }
    public static boolean isOdd(int number)throws NumberOddException{

        if(number %2==1){
            throw new NumberOddException("Numri s'mund te jete tek");
        };
        return false;

    }
}
