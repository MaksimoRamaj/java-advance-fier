package org.example.oop.homeworks.inheritance;

public class Figure {

    private double length;
    private double width;

    public Figure () {
    }

    public Figure(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.err.println("Duhet me e madhe se 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.err.println("Duhet me e madhe se 0");
        }
    }

    public double area () {
        return 0.0;
    }
}


