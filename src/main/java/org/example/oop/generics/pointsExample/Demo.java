package org.example.oop.generics.pointsExample;

public class Demo {
    public static void main(String[] args) {

        Coords<Point2D> coords = new Coords<>(new Point2D(5,6));
        Coords<Point3D> coords1 = new Coords<>(new Point3D(1,2,3));
        Coords<Point4D> coords2 = new Coords<>(new Point4D(4,6,23,4));

        showXY(coords);
        showXYZT(coords2);
    }

    static void showXY(Coords<? super Point4D> coords){
        System.out.println(coords.point.getX() + " " + coords.point.getY());
    }

    static void showXYZ(Coords<? extends Point3D> coords){
        System.out.println(coords.point.getX() + " " + coords.point.getY());
        System.out.println(coords.point.getZ());
    }

    static void showXYZT(Coords<? extends Point4D> coords){
        System.out.println(coords.point.getX() + " " + coords.point.getY());
        System.out.println(coords.point.getZ());
        System.out.println(coords.point.getT());
    }
}
