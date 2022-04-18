package lesson9;

public class Cat {
    private int privateField;
    int defaultField;
    public int publicField;

    public Cat(int privateField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    public Cat() {
    }

    @MyAnno
    public static void  publicMeow() {
        System.out.println("public Meow");
    }

    private void privateMeow() {
        System.out.println("private Meow");
    }

}
