abstract class A {
    abstract void print();
}

// class B extends A {
// void print() {
// System.out.println("Moshi");
// }
// }

public class abstract_anonymous {
    public static void main(String[] args) {
        A obj = new A() {
            void print() {
                System.out.println("Moshi moshi");
            }
        };
        obj.print();
    }
}
