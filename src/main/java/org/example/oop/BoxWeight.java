package org.example.oop;

public class BoxWeight extends Box{

    private double pesha;

    public BoxWeight() {
    }

    public BoxWeight(double height, double depth, double width, double pesha) {
        super(height, depth, width);
        this.pesha = pesha;
    }
}
