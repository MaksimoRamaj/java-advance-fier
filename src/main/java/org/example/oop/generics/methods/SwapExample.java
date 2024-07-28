package org.example.oop.generics.methods;

import java.util.Arrays;

public class SwapExample {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1,5,6,10,2};
        Double[] doubles = new Double[]{1.5,523.6,15.5,2.0};

        swap(integers,0,2);
        swap(doubles,1,3);

        for (Integer i : integers){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.stream(doubles).toList().stream().forEach(
                (d -> System.out.print(d + " "))
        );

    }

    public static <T extends Number> void swap(T[] arr,int first,int second){

        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
