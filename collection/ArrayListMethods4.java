package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb4 = new StringBuilder("C");
        StringBuilder sb3 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);

        ArrayList<String> arrayList1 = new ArrayList<>(50);
        arrayList1.add("qwr");
        arrayList1.add("fdv");
        arrayList1.add("e4f");
        String[] array2 = arrayList1.toArray(new String[5]);

        for (String s : array2) {
            System.out.println(s);
        }

        List<Integer> list1 = List.of(3, 8, 15);
        System.out.println(list1);


    }
}
