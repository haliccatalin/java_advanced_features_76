package org.example.threads;

public class Teorie {
    /*
    Thread

    - avem un thread principal care se refera la metoda main
     */

    public static void main(String[] args) {

        StopWatchThread stopWatchThread1 = new StopWatchThread("Thread 1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("Thread 2");
        stopWatchThread1.start();
        stopWatchThread2.start();

        StopWatchRunnable stopWatchRunnable1 = new StopWatchRunnable("Run 1");
        Thread thread = new Thread(stopWatchRunnable1);
        thread.start();

        putMainThreadOnSleep();
    }

    public static void putMainThreadOnSleep() {
        try {
            System.out.println("Main thread starts");

            // 1 secunda = 1000 milisecunde
            Thread.sleep(5 * 1000);

            System.out.println("Main thread is still running");

            Thread.sleep(5 * 1000);

            System.out.println("Main thread ends");
        } catch (InterruptedException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
