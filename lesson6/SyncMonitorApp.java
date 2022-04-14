package lesson6;

public class SyncMonitorApp {
    private Object monitor = new Object();

    public static void main(String[] args) {
        SyncMonitorApp syncMonitorApp = new SyncMonitorApp();
        new Thread(() -> syncMonitorApp.method()).start();
        new Thread(() -> syncMonitorApp.method()).start();
        new Thread(() -> syncMonitorApp.method()).start();

    }

    public void method() {
        try {
            System.out.println("Non-sync begin" + Thread.currentThread().getName());
            for (int i = 0; i < 3; i++) {
                System.out.println('.');
                Thread.sleep(200);
            }

            System.out.println("Non-sync end" + Thread.currentThread().getName());
            synchronized (monitor) {
                System.out.println("Sync begin" + Thread.currentThread().getName());
                for (int i = 0; i < 5; i++) {
                    System.out.println('.');
                    Thread.sleep(200);
                }
                System.out.println("Sync end" + Thread.currentThread().getName());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
