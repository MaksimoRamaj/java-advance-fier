package org.example.oop.interfaces.example2;

public class PremiumCDPlayer implements CDPlayer{
    @Override
    public void start() {
        System.out.println("Starting Premium CDPlayer!");
    }

    @Override
    public void playNext() {
        System.out.println("Playing Premium next song!");
    }

    @Override
    public void playPrev() {
        System.out.println("Playing Premium prev song!");
    }
}
