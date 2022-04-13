package lesson4.lists;

import java.lang.reflect.Field;
import java.util.*;

public class MainApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("s", "5", "r"));
        arrayList.ensureCapacity(100000);

        List list = new LinkedList();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(8, 0.75f);
        map.put(1,2);
        map.put(2,3);
        map.put(3,3);
        map.put(4,3);
        map.put(5,3);
        map.put(6,3);
        map.put(7,3);
        Class hashClass = HashMap.class;
        Field field = hashClass.getDeclaredField("table");
        field.setAccessible(true);
        int capacity = ((Object[]) field.get(map)).length;
        System.out.println(capacity);
    }
}
