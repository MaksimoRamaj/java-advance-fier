package org.example.oop.threads.executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("I'm shopping");
                    Thread.sleep(5000);
                    System.out.println("Thread: " + Thread.currentThread().getName() + ". Shopping done!");
                    return "Shopping done!";
                },
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("Washing dishes");
                    Thread.sleep(2000);
//                    System.out.println("Thread: " + Thread.currentThread().getName() + ". Dishes washed");
                    return "dishes washed";
                },
                () -> {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    System.out.println("Cleaning the room");
                    Thread.sleep(1000);
//                    System.out.println("Thread: " + Thread.currentThread().getName() + ". Room cleaned");
                    return "Room cleaned";
                }
        );

        //Metoda 1

//        List<Future> futures = new ArrayList<>();
//
//        for (Callable<String> callable : tasks){
//            futures.add(executorService.submit(callable));
//        }

        //Metoda 2
        List<Future<String>> listOfFutures = executorService.invokeAll(tasks);

        Thread.sleep(7000);
        if (listOfFutures.get(0).isDone()){
            System.out.println("Returned!: " + listOfFutures.get(0).get());
        }


        executorService.shutdown();

    }
}
