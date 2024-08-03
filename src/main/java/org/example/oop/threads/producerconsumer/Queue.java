package org.example.oop.threads.producerconsumer;

public class Queue {
    boolean produced = true;
    int n;
    public Queue() {
        this.n = 1;
    }

    public synchronized void put(int i) throws InterruptedException {
        while (produced){
            wait();
        }
        this.n = this.n + i;
        System.out.println("Produced: " + n);
        produced = true;
        notify();
    }

    public synchronized void get(int i) throws InterruptedException {
        while (!produced){
            wait();
        }
        System.out.println("Got: " + n);
        this.n = this.n - i;
        produced = false;
        notify();
    }


}
