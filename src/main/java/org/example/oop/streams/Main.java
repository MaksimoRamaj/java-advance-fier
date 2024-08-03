package org.example.oop.streams;

public class Main {

    public static String toLowerStrings(String string){
        return string.toLowerCase();
    }

    public static void convert(String str, Func func){
        String str1 = func.apply(str);
        System.out.println(str1);
    }

    public static void main(String[] args) {
        convert("AcddvBGHGH asdVGHGHH GGGG",Main::toLowerStrings);
    }
}
