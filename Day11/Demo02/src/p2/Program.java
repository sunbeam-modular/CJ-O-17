package p2;

class Box<T> {
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

public class Program {

    public static void display(Box b1) {

    }

    public static void display(Box b1) {

    }

    public static void main(String[] args) {
        // Box<int> b1 = new Box<>(); // NOT OK
        Box b1 = new Box<>(); // OK
        b1.setObj(11);
    }

}
