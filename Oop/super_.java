// Spoiler alert : super method is everywhere
class A {
    public A() {
        super(); // ? -> class A is also extended to Object class (by default) hidden actually

        System.out.println("From A");
    }

    public A(int n) {
        super();
        System.out.println("From A int");
    }
}

class B extends A {
    public B() {
        super(); // calls the super method
        System.out.println("From B");
    }

    public B(int n) {
        this(); // it is there even if its not there
        System.out.println("From B int");
    }
}

public class super_ {
    public static void main(String[] args) {
        B b = new B(); // calls both B and A
        B bb = new B(5); // calls only parameterized
        System.out.println(b);
        System.out.println(bb);

    }
}
