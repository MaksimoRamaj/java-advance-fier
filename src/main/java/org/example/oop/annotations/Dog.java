package org.example.oop.annotations;

public class Dog {

    @Important
    private String name;
    private int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
