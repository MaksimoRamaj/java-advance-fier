package org.example.oop.enums;

public class Demo {
    public static void main(String[] args) {
//        Drinks.valueOf("RAKI");
//
//        System.out.println(Drinks.COLA);
//
//       Drinks[] drinks = Drinks.values();
//
//       System.out.println("Metoda toString: "+drinks.toString());
//
//       System.out.println("Pas metodes toString: ");
//
//       for (int i = 0; i < drinks.length ; i++){
//           System.out.println(drinks[i]);
//       }
//
//       for (Drinks drink : drinks){
//           System.out.println(drink.ordinal() + " " + drink);
//       }

        System.out.println(Drinks.RAKI.compareTo(Drinks.RED_BULL));
        // 0-0
        // 2-1 = 1
        // 1-2 = -1

       int level = Drinks.COLA.niveliSheqerit;
    }
}
