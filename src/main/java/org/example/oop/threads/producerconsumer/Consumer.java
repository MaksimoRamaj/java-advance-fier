package org.example.oop.threads.producerconsumer;

public class Consumer {

    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public void consume(){
        while (true){
            try {
                this.queue.get(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
