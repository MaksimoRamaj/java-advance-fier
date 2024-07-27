package org.example.oop.abstraction;

import org.example.oop.interfaces.Printable;

public class Car extends Vehicle {

    int noOfTires;

    public Car(boolean hasEngine, Color color, int noOfTires) {
        super(hasEngine, color);
        this.noOfTires = noOfTires;
    }

    @Override
    public void move() {
        System.out.println("Makina po leviz!");
    }

    @Override
    public void brake() {
        System.out.println("Makina po frenon!");
    }

    @Override
    public void honk(){
        System.out.println("Beep Beep");
    }

    public void changeTire(){
        System.out.println("Duke ndryshuar gomen!");
    }

}
