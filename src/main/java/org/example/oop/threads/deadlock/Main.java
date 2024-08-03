package org.example.oop.threads.deadlock;

public class Main {

    private final static String lock1 = "lock1";
    private final static String lock2 = "lock2";

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    A();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    B();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();



    }

    public static void A() throws InterruptedException {
        synchronized (lock1){
            System.out.println("Sync with lock1!");
            Thread.sleep(5000);
            synchronized (lock2){
                System.out.println("Sync with lock2!");
            }
        }
    }

    public static void B() throws InterruptedException {
        synchronized (lock2){
            System.out.println("Sync with lock2!");
            Thread.sleep(5000);
            synchronized (lock1){
                System.out.println("Sync with lock1!");
            }
        }
    }
}
