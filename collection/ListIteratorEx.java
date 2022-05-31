package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";

        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator1 = list.listIterator();
        ListIterator<Character> iterator2 = list.listIterator(list.size());

        boolean isPalindrom = true;

        while (iterator1.hasNext() && iterator2.hasPrevious()) {
            if (iterator1.next() != iterator2.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Palindrome");
        } else System.out.println("Not palindrome");
    }
}
