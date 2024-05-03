class A {
    class B { // inner class

    }

    static class C { // static inner class

    }

    public void hello() {
        class D { // local class

        }
    }
}

public class praccc {
    public static void main(String[] args) {
        A obj = new A();
        A.B blahblah = obj.new B();
        A.C blah = new A.C();
        obj.hello();

    }
}
