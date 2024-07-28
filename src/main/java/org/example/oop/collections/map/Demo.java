package org.example.oop.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> treeMap = new HashMap<Integer,String>();
        TreeMap<Integer,String> treeMap2 = new TreeMap<>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        treeMap.put(2001,"Berat");
        treeMap.put(4001,"Berat");
        treeMap.put(5001,"Berat");
        treeMap.put(5005,"Berat");
        treeMap.put(5002,"Tirana");
        treeMap.put(3000,"Fieri");

//      System.out.println(treeMap.get(5002));


        for (Map.Entry<Integer,String> entry  : treeMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        };
    }
}
