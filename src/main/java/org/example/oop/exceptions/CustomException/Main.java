package org.example.oop.exceptions.CustomException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("dasf");

        }catch (FileNotFoundException e){

        }

    }
}
