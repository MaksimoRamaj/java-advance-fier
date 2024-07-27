package org.example.oop.interfaces.example2;

public class NormalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting normal engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping normal engine!");
    }
}
