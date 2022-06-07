package nested_class.inner_class;


public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        int horsePower;


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


}

class Test {
    public static void main(String[] args) {
        Car car = new Car("bf", 4, 100);

        Car car1 = new Car("qwe", 5);
        Car.Engine engine = car1.new Engine(152);
        car1.setEngine(engine);
        System.out.println(engine);
        System.out.println(car1);

        Car.Engine engine1 = new Car("yellow", 2).new Engine(87);
        System.out.println(engine1);
    }
}


