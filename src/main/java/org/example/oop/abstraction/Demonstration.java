package org.example.oop.abstraction;

public class Demonstration {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(true,Color.BLACK,4);

        vehicle.honk();

        Vehicle ship = new Ship(true,Color.GRAY);
        ship.honk();
    }
}
