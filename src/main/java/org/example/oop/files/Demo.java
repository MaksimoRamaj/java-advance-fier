package org.example.oop.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {

        String path = "C:\\Users\\USER\\OneDrive\\Desktop\\java-advance-fier\\src\\main\\resources\\myfiles\\myFile.txt";

        //        try {
//            lexoFile(path);
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        String content = "However, it is impossible to break the thread in a trivial way. The Thread class provides a stop method, but we shouldn't use it. At most, we can send a request to stop such a thread. The programmer, in the code of a separate thread, decides what to do with this fact. We send such a signal by calling the interrupt method, available on the Thread class instance.";

        try {
            writeToFile(path,content);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void writeToFile(String url,String content) throws IOException {
        Path path = Paths.get(url);

        if (!path.toFile().exists()){
            Files.createFile(path);
        }
        //try with resources
        try (FileWriter fw = new FileWriter(path.toFile())){

            for (char c : content.toCharArray()){
                fw.write(c);
            }

        }catch (FileNotFoundException e){
            System.out.println("File nuk u gjet!");
        }

        System.out.println("File u shkrua me sukses :)");

    }

    public static void lexoFile(String url) throws IOException {

        //non immutable - i ndryshueshem
        StringBuilder sb = new StringBuilder();
        Path path = Paths.get(url);

        if (!path.toFile().exists()){
            Files.createFile(path);
        }
        //try with resources
        try (FileReader fr = new FileReader(path.toFile())){

            int c;

            while ( (c=fr.read()) != -1){
                System.out.print((char) c);
            }

        }catch (FileNotFoundException e){
            System.out.println("File nuk u gjet!");
        }

    }
}
