@FunctionalInterface // help the compiler
interface A {
    void display();
    // interface having only one method -> functional interface
}

// class B implements A {
// public void display() {
// System.out.println("From B");
// }
// }

public class functional_interfaces {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void display() {
        // System.out.println("From B");
        // }
        // };

        // lambda expressions
        A obj = () -> {
            System.out.println("From B");
        };
        obj.display();
    }
}
