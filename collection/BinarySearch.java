package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(-9);
        arrayList.add(-42);
        arrayList.add(2);
        arrayList.add(14);
        arrayList.add(7);
        arrayList.add(90);
        arrayList.add(75);
        arrayList.add(33);
        arrayList.add(67);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 100);
        System.out.println(index);

    }
}
