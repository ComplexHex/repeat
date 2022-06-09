package lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Nissan", "silver", 1.6));
        System.out.println(ourCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(supplier.get());

        }
        return arrayList;
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
