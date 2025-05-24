package mediem_java;

public class Overrid {
    void sum() {
        System.out.println("Hello world");
    }
}

class Over extends Overrid {
    @Override
    void sum() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Over o = new Over();
        o.sum();
    }
}
