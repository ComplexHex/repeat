package lesson1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Ba", "bl", 3);
        Cat cat2 = new Cat("Ba213", "blasd", 5);


        cat.info();
        cat2.info();


        Box box1 = new Box("d", 1);
        Box box2 = new Box("d", 1);
        System.out.println(box1.equals(box2));
        System.out.println(box1 == box2);
    }
}
