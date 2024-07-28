package org.example.oop.generics.pointsExample;

public class Point4D extends Point3D{

    private int t;

    public Point4D(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}
