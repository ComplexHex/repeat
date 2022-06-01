package collection;

import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("asdf", "asdffvf", 5);
        Student student2 = new Student("f", "vasf", 3);
        Student student3 = new Student("df", "ffvf", 4);
        Student student4 = new Student("as", "asdsdfff", 5);
        Student student5 = new Student("fuu", "asfdhf", 3);
        Student student6 = new Student("djj", "fff", 4);
        Student student7 = new Student("asd", "asvdfff", 5);
        Student student8 = new Student("asd", "asvdfff", 5);

        treeMap.put(2.9, student3);
        treeMap.put(3.2, student8);
        treeMap.put(4.4, student6);
        treeMap.put(5.8, student1);
        treeMap.put(6.4, student2);
        treeMap.put(6.8, student4);
        treeMap.put(8.8, student5);
        treeMap.put(9.1, student7);

        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));
        treeMap.remove(8.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(5.8));
        System.out.println(treeMap.headMap(5.8));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }
}
