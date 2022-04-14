package lesson6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceApp {
    public static void main(String[] args) {
        ExecutorService serviceApp = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            final int w = i + 1;
            serviceApp.execute(() -> {
                System.out.println(w + "- Begin");

                try {
                    Thread.sleep(1040 + (int) (2000 * Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(w + "- End");
            });
        }
        serviceApp.shutdown();
    }
}
