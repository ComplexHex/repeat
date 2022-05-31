package collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(50);
        arrayList1.add("qwr");
        arrayList1.add("fdv");
        arrayList1.add("e4f");
        arrayList1.add(2, "e234f");


        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(arrayList1.get(1));
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("asd");
        arrayList2.add("avt");
        arrayList2.add("dbr");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.indexOf("asd"));

    }


}
