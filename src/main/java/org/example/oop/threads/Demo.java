package org.example.oop.threads;

public class Demo {
    public static void main(String[] args) {

        MySecondThread mySecondThread = new MySecondThread();
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 5 ; i++){
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
        });
        //duke perdorur lambda
        Thread t3 = new Thread(()->{
            for (int i = 0 ; i < 5 ; i++){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Emri: " + Thread.currentThread().getName()
                        + " Prioriteti: " + Thread.currentThread().getPriority()
                        + " iteracioni: " + i );
            }
        });

        try {
            t1.start();
            t1.join();//main pret
        } catch (InterruptedException | RuntimeException e) {
            System.out.println(t1.getName() + " u nderpre!");
        }
        mySecondThread.start();
        t2.start();

    }
}
