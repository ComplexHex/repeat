package nested_class.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math math = new Math() {
            int c = 10;

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.doOperation(3, 5));


        Math math1 = new Math() {
            int c = 10;

            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(math1.doOperation(3, 5));
    }
}


interface Math {
    int doOperation(int a, int b);
}
