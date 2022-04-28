package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        //map method
//        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
//        list = list.stream().map(a -> a * 2).collect(Collectors.toList());


//        arr = Arrays.stream(arr).map(a -> 3).toArray();
//        arr = Arrays.stream(arr).map(a -> a + 1).toArray();

        //filter method
//        arr = Arrays.stream(arr).filter(value -> value % 2 == 0).toArray();
//        list = list.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
//
//        Arrays.stream(arr).forEach(System.out::println);
//        list.forEach(System.out::println);

        //reduce
//        int sum = Arrays.stream(arr).reduce((acc, b) -> acc + b ).getAsInt();
//        int sum1 = list.stream().reduce((acc, b) -> acc * b ).get();
//
//        System.out.println(sum);
//        System.out.println(sum1);


        arr = Arrays.stream(arr).filter(value -> value % 2 != 0).map(a ->a*2).toArray();


        System.out.println(Arrays.toString(arr));
        System.out.println(list);

    }
}
