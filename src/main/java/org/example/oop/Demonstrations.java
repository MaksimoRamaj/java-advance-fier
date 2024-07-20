package org.example.oop;

public class Demonstrations {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        BoxWeight boxWeight = new BoxWeight();

//        System.out.println(b1.equals(b2));

//        b1.height = -1;

//        b1.setHeight(-1);



        //b1 dhe b2 kane secili parametrat e vet
//        System.out.println("b1.height: "+b1.height);
//        System.out.println("b1.height: "+b1.getHeight());

//        System.out.println("b2.height: " +b2.height);

        Box box = new Box();


        Box myBox = new Box(1,2,3);

        myBox.volume(5,6,8);

        //Rasti i dynamic polymorphysim

        Box box1 = new Box(100,220,3);
        BoxWeight boxWeight1 = new BoxWeight(1,2,3,500);

        //Rasti femija i referohet prindit X

       System.out.println(box1.volume());

       box1 = boxWeight1;

       System.out.println(box1.volume());

    }
}
