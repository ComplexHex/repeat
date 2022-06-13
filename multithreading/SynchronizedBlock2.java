package multithreading;

public class SynchronizedBlock2 {
    public static void main(String[] args) {
        MyrunnableImpl2 runnable = new MyrunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyrunnableImpl2 implements Runnable {

    private void doWork2() {
        System.out.println("Yes");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
