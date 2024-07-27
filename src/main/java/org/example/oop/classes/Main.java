package org.example.oop.classes;

public class Main {
    public static void main(String[] args) {

        //menyra e krijimit te objekteve te klases se brendshme

        OuterClass outerClass = new OuterClass(10,5);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.myInnerClassMethod();

        OuterClass.InnerClass innerClass1 = outerClass.createInnerClassMethod(5);

        //per klasen statike te brendshme

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

    }
}
