package org.example.oop.collections.listat;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();

        //Renditja e numrave
        //List
        List<Integer> integers = Arrays.asList(1,20,15,25,2,3);
        //Konvertim ne Arraylist
        ArrayList<Integer> integerArrayList = new ArrayList<>(integers);

        Collections.sort(integerArrayList);
        Collections.reverse(integerArrayList);
//        for (Integer i : integerArrayList){
//            System.out.print(i + " ");
//        }
//        System.out.println();



        ArrayList<Car> cars = new ArrayList<>();

        Car car = new Car(2001,"Benz");
        Car car1 = new Car(2012,"Audi");
        Car car2 = new Car(2005,"BMW");
        Car car3 = new Car(2016,"Volvo");

        cars.add(car);cars.add(car1);cars.add(car2);cars.add(car3);

        //Comparatori i shprehur me lambda expression

        Comparator<Car> carsComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYearOfProduction() - o2.getYearOfProduction();
            }
        };
        Collections.sort(cars, ((o1, o2) -> o1.getYearOfProduction() - o2.getYearOfProduction()));
        Collections.sort(cars,carsComparator);
        //printo permbajtjen
//        for (Car c : cars){
//            System.out.println(c.getBrand() + " " + c.getYearOfProduction());
//        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        /*System.out.println(list.peek() + " "+ list.peek());
        System.out.println(list.get(0) + " " +list.get(0));*/

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.getFirst();
        deque.getLast();

        // Iteratoret e ngjashme me for each

       Iterator<Integer> iterator = list.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
