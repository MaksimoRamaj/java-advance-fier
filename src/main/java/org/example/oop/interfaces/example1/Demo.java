package org.example.oop.interfaces.example1;

import org.example.oop.abstraction.Car;
import org.example.oop.abstraction.Color;

public class Demo {
    public static void main(String[] args) {

        String text = "An alternative way to implement reusable " +
                "components that, unlike inheritance, " +
                "it does not extend the behavior of the base classes, " +
                "but focuses on assembling objects. " +
                "A class aggregates other classes within itself.";


        Printer printer = new Printer();

        Car car = new Car(true, Color.GRAY,4);
        Document document = new Document(text);

        printer.startPrinter(document);

    }
}
