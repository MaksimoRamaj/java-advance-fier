package org.example.oop;

public class Box {
    private double height;
    private double depth;
    private double width;

    public Box() {
    }

    public Box(double height, double depth, double width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            this.height = 0;
            System.err.println("Vendos nje numer > 0");
        }else {
            this.height = height;
        }
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
