package org.example.oop.generics;


//Generics
public class Box<T,E> {
    private double height;
    private double depth;
    private double width;

    private T firstContent;
    private E secondContent;

    public E getSecondContent() {
        return secondContent;
    }

    public void setSecondContent(E secondContent) {
        this.secondContent = secondContent;
    }

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


    public T getFirstContent() {
        return firstContent;
    }

    public void setFirstContent(T firstContent) {
        this.firstContent = firstContent;
    }


}

