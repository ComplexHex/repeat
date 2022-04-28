package lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("asdfas");
        list.add("a1sdfassssss");
        list.add("as1dfassss");
        list.add("asd1fass");
        list.add("asdf1asss");


        Comparator<String> comparator = (s1, s2)-> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };

            list.sort(comparator);
        System.out.println(list);
    }
}
