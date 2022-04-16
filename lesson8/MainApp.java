package lesson8;

import java.util.concurrent.Callable;

public class MainApp {


    public static void main(String[] args) {

        MyNumber myNumber;
        doSomething(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Java");
            }
        });

        doSomething(() -> {
            System.out.println(100);
        });

        doSomething(() -> {
            int n = 5;
            System.out.println(n * 1);
        });
        myNumber = () -> {
            return 123.45;
        };

        myNumber = () -> Math.random()*100;

    }


    public static void doSomething(Runnable runnableObj) {
        runnableObj.run();
    }


}
