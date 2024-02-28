class A {
    void print() {
        System.out.println("hello");
    }

    void run() {
        System.out.println("Running");
    }
}

// class B extends A {
// void print() {
// System.out.println("Hey");
// }
// }

// INSTEAD =================

public class anonymousInner {
    public static void main(String[] args) {
        // Instead do this
        A obj = new A() {
            void print() {
                System.out.println("Hey");
            }

            void run() {
                System.out.println("Running fast");
            }
        };
        // Can do this instead of creating another class
        // for one time it is better
        obj.print();
        obj.run();
    }
}
