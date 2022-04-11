package lesson1;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Box)) {
            return false;
        }

        Box anotherBox = (Box) obj;
        return this.color.equals(anotherBox.color) && this.size == anotherBox.size;
    }
}
