package org.example.oop.generics.wildcards;

import org.example.oop.Box;
import org.example.oop.abstraction.Car;

public class Demo {
    public static void main(String[] args) {


        Stats<Integer> integerStats = new Stats<>(
                new Integer[]{1,2,3,4,5});

        Stats<Double> doubleStats = new Stats<>(
                new Double[]{1.0,2.0,3.0,4.0,5.0}
        );

        System.out.println("Int avg: " + integerStats.average());
        System.out.println("Double avg: " + doubleStats.average());

        integerStats.sameAvg(doubleStats);
        doubleStats.sameAvg(integerStats);

    }
}
