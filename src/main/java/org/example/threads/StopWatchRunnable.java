package org.example.threads;

public class StopWatchRunnable implements Runnable {
    private String name;

    public StopWatchRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " Runnable: " + i);

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
