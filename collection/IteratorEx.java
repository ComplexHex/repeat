package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("qwr");
        arrayList1.add("fdv");
        arrayList1.add("e4f");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
           iterator.next();
           iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
