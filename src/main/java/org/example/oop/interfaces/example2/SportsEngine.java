package org.example.oop.interfaces.example2;

public class SportsEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting sports engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping sports engine!");
    }
}
