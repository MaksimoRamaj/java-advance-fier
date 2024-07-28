package org.example.oop.collections;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
     public static int sum(int number){
        if (number == 0){
            return 0;
        }
        return sum(number - 1) + number;
     }
}
