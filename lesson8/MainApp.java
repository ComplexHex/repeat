package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        myNumber = () -> Math.random() * 100;


        Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5).stream().distinct().forEach(System.out::print);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list.stream().allMatch(integer -> integer > 0 && integer < 2));
        System.out.println(list.stream().anyMatch(integer -> integer > 0 && integer < 2));
        System.out.println(list.stream().noneMatch(integer -> integer > 0 && integer < 2));
        list.stream().filter(n-> n>3).findAny().ifPresent(System.out::println);

    }
        public static void doSomething (Runnable runnableObj){
            runnableObj.run();
        }
    }


