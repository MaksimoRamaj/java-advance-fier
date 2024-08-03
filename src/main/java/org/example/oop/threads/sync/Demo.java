package org.example.oop.threads.sync;

public class Demo {
    public static void main(String[] args) {

        CallMe callMe = new CallMe();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    callMe.call("Hello!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            try {
                callMe.call("Ciao!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(()->{
            try {
                callMe.call("Ckemi!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
