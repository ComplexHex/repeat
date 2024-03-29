package lambda;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
       int a= e.execute(6,5);
        System.out.println(a);
    }
}


public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y ) {

                return x + y;
            }
        });
        runner.run((x, y) -> {


            return x+y;
        });




//        Thread thread = new Thread(() -> System.out.println("hello"));

    }
}

