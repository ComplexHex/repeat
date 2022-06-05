package nested_class.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car:{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(60);
        System.out.println(e);
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(110);

        System.out.println(e);

        Car car = new Car("grey", 4, e);
        System.out.println(car);
    }
}

class Z extends Car.Engine {
    public Z() {
        super(200);
    }

    ;
}
