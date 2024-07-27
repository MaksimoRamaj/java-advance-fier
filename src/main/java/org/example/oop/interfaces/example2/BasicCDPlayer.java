package org.example.oop.interfaces.example2;

public class BasicCDPlayer implements CDPlayer{
    @Override
    public void start() {
        System.out.println("Starting Basic CDPlayer!");
    }

    @Override
    public void playNext() {
        System.out.println("Playing Basic next song!");
    }

    @Override
    public void playPrev() {
        System.out.println("Playing Basic prev song!");
    }
}
