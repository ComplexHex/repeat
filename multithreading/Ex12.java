package multithreading;

public class Ex12 {
    static final Object lock = new Object();


    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void viberCall() {
        synchronized (lock) {
            System.out.println("Viber call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Viber call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnanleImplMobile());
        Thread thread2 = new Thread(new RunnanleImplSkype());
        Thread thread3 = new Thread(new RunnanleImplViber());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnanleImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnanleImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnanleImplViber implements Runnable {
    @Override
    public void run() {
        new Ex12().viberCall();
    }
}

