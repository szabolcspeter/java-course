package szabi.learnjava.generics;

class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class GenericClass {

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setItem("Szabi");
        System.out.println(box.getItem());
    }
}
