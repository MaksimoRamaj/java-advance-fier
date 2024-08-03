package org.example.oop.threads.producerconsumer;

public class Producer {

    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void produce(){
        while (true){
            try {
                queue.put(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
