package org.example.oop.threads.producerconsumer;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        consumer.consume();
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        producer.produce();
                    }
                }
        );

        t2.start();
        t1.start();
    }
}
