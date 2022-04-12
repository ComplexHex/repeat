package lesson4;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//
//        intBox1.setObject("Java");
//
//        if(intBox1.getObject() instanceof Integer && intBox2.getObject() instanceof Integer){
//            int sum = (Integer) intBox1.getObject() + (Integer) intBox2.getObject();
//            System.out.println(sum);
//        }else System.out.println("error");


        GenBox<String> stringGenBox = new GenBox<>("Java");
        GenBox<Integer> intGenBox1 = new GenBox<>(12);
        GenBox<Integer> intGenBox2 = new GenBox<>(20);


        int sum = intGenBox1.getObj() + intGenBox2.getObj();
        System.out.println(sum);
    }

    public static <T> T getFirstElement(List<T> list){
        return list.get(1);
    }

}


