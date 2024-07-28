package org.example.oop.generics.pointsExample;

public class Coords<T extends Point2D>{

    T point;

    public Coords(T point) {
        this.point = point;
    }
}
