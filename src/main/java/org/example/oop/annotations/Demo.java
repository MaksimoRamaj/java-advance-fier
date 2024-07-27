package org.example.oop.annotations;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Dog dog = new Dog("Rex",2);

       Field[] fields = dog.getClass().getDeclaredFields();

       System.out.println(dog.getName());

       for (Field f : fields){
           if (f.isAnnotationPresent(Important.class)){
               f.setAccessible(true);
               f.set(dog,"Balto");
           }
       }

       System.out.println(dog.getName());

       Cat cat2 = new Cat("cat1",1);

       //nepermjet lombok
       Cat cat = Cat.builder()
               .name("Kitty")
               .age(2)
               .build();

    }
}
