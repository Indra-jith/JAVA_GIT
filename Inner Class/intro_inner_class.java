class A {
    void hello() {
        System.out.println("Hello");
    }

    // inner class
    static class B { // observe the directory there will be a class called A$B
        void print() {
            System.out.println("Print");
        }
    }
}

public class intro_inner_class {
    public static void main(String[] args) {
        A obj = new A();
        obj.hello();
        // how to call print?
        // B obj1 = new B(); //won't work
        // A.B obj1 = obj.new B(); // Correct represenation (for non static inner class)
        A.B obj1 = new A.B(); // for static inner class
        obj1.print();
    }
}
