package org.example.oop.abstraction;

public class Ship extends Vehicle{

    public Ship(boolean hasEngine, Color color) {
        super(hasEngine, color);
    }

    @Override
    public void move() {
        System.out.println("Anija po leviz!");
    }

    @Override
    public void brake() {
        System.out.println("Anija po frenon!");
    }
}
