package org.example.oop.threads.sync;

public class CallMe {

    private final String lock1 = "lock1";
    private final String lock2 = "lock1";

    public void call(String message) throws InterruptedException {
        synchronized (lock1) {
            System.out.print("[" + message);
            Thread.sleep(5000);
            System.out.println("]");
        }
    }

    public void call2(String message) throws InterruptedException {
        synchronized (lock1) {
            System.out.print("[" + message);
            Thread.sleep(5000);
            System.out.println("]");
        }
    }
}
