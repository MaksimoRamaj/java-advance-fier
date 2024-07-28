package org.example.oop.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        Box<Integer,String> box = new Box<>();

        Box<String,String> stringBox = new Box<>();

        box.setSecondContent("MyString");

        System.out.
                println(
                        box.getSecondContent().length());

    }
}
