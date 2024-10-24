package org.example.threads;

public class StopWatchThread extends Thread {
    private String threadName;

    public StopWatchThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        // metoda run() - reprezinta inima Thread-ului
        //                atunci cand codul din run() s-a terminat,
        //                threadul se opreste

        for(int i = 0; i < 10; i++) {
            System.out.println(this.threadName + " - Stop watch: " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
