package org.example.oop.interfaces.example2;

public class Car{

    CDPlayer cdPlayer;
    Engine engine;

    public Car(CDPlayer cdPlayer, Engine engine) {
        this.cdPlayer = cdPlayer;
        this.engine = engine;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
