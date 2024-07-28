package org.example.oop.generics.withoutGen;



public class Box {
    private double height;
    private double depth;
    private double width;

    private Object[] object;

    public Box() {
    }

    public Box(double height, double depth, double width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public double volume(){
        return this.height * this.width * this.depth;
    }

    public double volume(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        return this.height * this.width * this.depth;
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

    public Object[] getObject() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }
}
