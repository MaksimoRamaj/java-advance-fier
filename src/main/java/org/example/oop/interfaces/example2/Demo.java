package org.example.oop.interfaces.example2;

public class Demo {
    public static void main(String[] args) {

        CDPlayer basicCdPlayer = new BasicCDPlayer();
        CDPlayer premiumCdPlayer = new PremiumCDPlayer();


        Engine normalEngine = new NormalEngine();
        Engine sportsEngine = new SportsEngine();

        Car car = new Car(premiumCdPlayer,sportsEngine);
        Car car2 = new Car(basicCdPlayer,normalEngine);

        car.cdPlayer.start();
        car.engine.start();


    }
}
