package org.example.oop.composition.point2dexe;

public class Demonstration {
    public static void main(String[] args) {
        Circle circle= new Circle(new Point2D(0,0),new Point2D(2,2));
        double r= circle.getRadius();
        System.out.println("Rrezja eshte: " + r +"\n"+
                "Perimetri eshte: " +circle.getCircumference()+ "\n" +
        "Siperfaqja eshte: " + circle.getArea());

        }
    }
