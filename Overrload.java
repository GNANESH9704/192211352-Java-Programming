package java_class;

class Base {
    public void parent() {
        System.out.println("hi");
    }
}

class Parent extends Base {
    public void parent() {
        System.out.println("hello");
    }
}

public class Overrload{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parent();
    }
}
