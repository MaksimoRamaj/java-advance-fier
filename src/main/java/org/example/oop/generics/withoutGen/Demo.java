package org.example.oop.generics.withoutGen;

public class Demo {
    public static void main(String[] args) {

        Box box = new Box();

        box.setObject(new Object[]{1,"myStriing",3});

        Object[] objects = box.getObject();

        String a = "";

        if (objects[2] instanceof String){
             a = (String) objects[1];
        }

        System.out.println(a.length());

    }
}
