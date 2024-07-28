package org.example.oop.collections.sets;

import org.example.oop.collections.listat.Car;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getYearOfProduction() == o2.getYearOfProduction()){
                    if (o1.getBrand().charAt(0) == o2.getBrand().charAt(0)){
                        return o1.hashCode() - o2.hashCode();
                    }else {
                        return o1.getBrand().charAt(0) - o2.getBrand().charAt(0);
                    }
                }
                return o1.getYearOfProduction() - o2.getYearOfProduction();
            }
        });

        Car car = new Car(2001,"Benz");
        Car car1 = new Car(2010,"Audi");
        Car car2 = new Car(2005,"BMW");
        Car car3 = new Car(2016,"Volvo");
        Car car4 = new Car(2010,"Audi");

        System.out.println(car1.hashCode());
        System.out.println(car4.hashCode());

        boolean ans = cars.add(car);
        System.out.println(ans);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars.add(car4));

//        for (Car c : cars){
//            System.out.println(c.getBrand() + " " + c.getYearOfProduction());
//        }


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(15);
        linkedHashSet.add(12);

//        for (Integer i : linkedHashSet){
//            System.out.println(i);
//        }

        HashSet<Car> carHashSet = new HashSet<>();

        carHashSet.add(car1); //Audi
        carHashSet.add(car2); //BMW
        carHashSet.add(car3);

        for (Car c : carHashSet){
            System.out.println(c.toString());
        }
    }
}
