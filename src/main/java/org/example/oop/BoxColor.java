package org.example.oop;

import org.example.oop.BoxWeight;

public class BoxColor extends BoxWeight {
    private String color;

    public BoxColor(double height, double depth, double width, double pesha, String color) {
        super(height, depth, width, pesha);
        this.color = color;
    }
}
