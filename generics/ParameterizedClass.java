package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("hi");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(1);
        System.out.println(info2);
    }

}

class Info<T>{
    private T value;
    public Info(T value){
        this.value = value;

    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}
