package lesson4;

public class SimpleBox {
    private Object object;

    public SimpleBox(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void info(){
        System.out.println(object.getClass().getSimpleName() + " " + object);
    }
}
