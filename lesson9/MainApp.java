package lesson9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainApp {
    public static void main(String[] args) throws Exception {
//        System.out.println(MainApp.class.getName());
//        System.out.println(String.class);
//        System.out.println(int.class);
//        System.out.println(int[].class);
//        System.out.println(int[][].class);
//
//        System.out.println(void.class);
//
//
//        Class stringClass1 = "Java".getClass();
//        Class stringClass2 = String.class;
//        try {
//            Class stringClass3 = Class.forName("java.lang.String");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        Class classCat = Cat.class;
        System.out.println(classCat.getModifiers());
        System.out.println(classCat.isEnum());

        Method[] methods = Cat.class.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

//        Cat cat = new Cat(1,2,3);
//        try {
//            methods[0].invoke(cat);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//
//        methods[1].setAccessible(true);
//        methods[1].invoke(cat);


        int mods = methods[0].getModifiers();
        System.out.println(Modifier.isPublic(mods));
        System.out.println(Modifier.isPrivate(mods));
        System.out.println(Modifier.isFinal(mods));
    }
}
