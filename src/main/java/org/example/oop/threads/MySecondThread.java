package org.example.oop.threads;

public class MySecondThread extends Thread{

    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Emri: " + Thread.currentThread().getName()
                    + " Prioriteti: " + Thread.currentThread().getPriority()
                    + " iteracioni: " + i );
        }
    }
}
