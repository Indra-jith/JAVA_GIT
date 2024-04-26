class Box<T> {
    T var1;

    Box(T var1) {
        this.var1 = var1;
    }

    public T getit() {
        return var1;
    }
}

class Test {
    public <T> void blah(T num1, T num2) {
        System.out.println("first thing is " + num1 + " and second is " + num2);
    }
}

public class gen {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<Float> b2 = new Box<>(11.4f);
        System.out.println(b1.getit());
        System.out.println(b2.getit());
        Test t1 = new Test();
        t1.blah(24, 248);
        t1.blah("hello", "hi");
    }
}
