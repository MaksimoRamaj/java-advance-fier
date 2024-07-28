package org.example.oop.anonymousclasses;

public class Demo {
    public static void main(String[] args) {
         int x = 5;

        Greeting albGreeting = new AlbanianGreeting();
        Greeting alb2Greeting  = new AlbanianGreeting();

        albGreeting.greet();
        alb2Greeting.greet();

        Greeting italianGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Ciao!");
            }
        };

        // lambda expressions
        Greeting germanGreeting = ()->{
            System.out.println("Halo!");
        };

        germanGreeting.greet();

        italianGreeting.greet();
        italianGreeting.greet();

    }
}
