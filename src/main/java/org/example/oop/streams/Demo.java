package org.example.oop.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1,58,6,2,48,63,4,2)
        );

        List<Integer> list = arrayList.stream()
                .map((integer)->integer*2)
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

//        list.stream().forEach(i -> System.out.println(i + " "));

//        arrayList.stream()
//                .map((integer)->integer*2)
//                .filter(integer -> integer % 4 == 0)
//                .forEach(integer -> System.out.println(integer));

        //flatMap

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,58,6,2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(48,63,4,2));

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        arrayLists.add(list1);
        arrayLists.add(list2);

       List<Integer> list3 = arrayLists.stream()
               .flatMap(integers -> integers.stream())
                .collect(Collectors.toList());

//       list3.stream().forEach(integer -> System.out.println(integer));

//       arrayLists.stream().forEach(arrayList2 -> arrayList2.stream()
//               .forEach(integer -> System.out.println(integer)));


        OptionalDouble average = arrayList.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(average.getAsDouble());


    }
}
