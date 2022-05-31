package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(50);
        arrayList1.add("qwr");
        arrayList1.add("fdv");
        arrayList1.add("e4f");
        List<String> arrayList2 = new ArrayList<>(50);

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        ArrayList<String> arrayList4 = new ArrayList<>(50);
        System.out.println(arrayList1);
        System.out.println(arrayList3);

    }
}
