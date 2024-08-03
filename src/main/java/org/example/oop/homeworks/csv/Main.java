package org.example.oop.homeworks.csv;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Movie> arrayList =new ArrayList<>( Arrays.asList(
                new Movie("Movie1",2001),
                new Movie("Movie2",2010),
                new Movie("Movie3",2015)
        ));

        String path = "C:\\Users\\USER\\OneDrive\\Desktop\\java-advance-fier\\src\\main\\resources\\myfiles\\movies.csv";

        writeToFile(path,arrayList);

        ArrayList<Movie> movies = readFile(path);

        movies.stream().forEach(movie -> System.out.println(
                movie.getTitle() + " " + movie.getYearOfRelease()
        ));

    }

    public static ArrayList<Movie> readFile(String filePath) throws FileNotFoundException {
        Path path = Paths.get(filePath);

        if (!path.toFile().exists()){
            throw new FileNotFoundException();
        }

        ArrayList<Movie> movies = new ArrayList<>();

        try (FileReader fileReader = new FileReader(path.toFile());
                BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line = null;

            while ((line = bufferedReader.readLine()) != null){

                String words[] = line.split(",");

                Movie movie = new Movie(words[0],Integer.parseInt(words[1]));

                movies.add(movie);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return movies;

    }

    public static void writeToFile(String filePath,ArrayList<Movie> movies) throws IOException {
        Path path = Paths.get(filePath);

        if (!path.toFile().exists()){
            Files.createFile(path);
        }

        try (FileWriter fw = new FileWriter(path.toFile());
             BufferedWriter bw = new BufferedWriter(fw)){

            for (Movie movie : movies){

                StringBuilder sb = new StringBuilder();
                sb.append(movie.getTitle()+",");
                sb.append(movie.getYearOfRelease());
                bw.write(sb.toString());
                bw.newLine();

            }


        }
        System.out.println("File u shkrua me sukses!");
    }
}
