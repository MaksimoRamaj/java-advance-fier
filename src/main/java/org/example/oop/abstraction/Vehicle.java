package org.example.oop.abstraction;

import java.time.Month;

public abstract class Vehicle {
    private boolean hasEngine;
    private Color color;

    public Vehicle(boolean hasEngine,Color color) {
        this.hasEngine = hasEngine;
        this.color = color;
    }

    public abstract void move();

    public abstract void brake();

    public void honk(){
        System.out.println("Honk! Honk!");
    }

    public void start(){
        System.out.println("Vehicle started!");
    }

}
