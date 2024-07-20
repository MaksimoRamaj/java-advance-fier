package org.example.oop;

public class Demonstrations {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        BoxWeight boxWeight = new BoxWeight();

        System.out.println(b1.equals(b2));

//        b1.height = -1;

        b1.setHeight(-1);



        //b1 dhe b2 kane secili parametrat e vet
//        System.out.println("b1.height: "+b1.height);
//        System.out.println("b1.height: "+b1.getHeight());

//        System.out.println("b2.height: " +b2.height);
    }
}
