class Student {
    void Study() {
        System.out.println("Studying ");
    }
}

class Student1 extends Student {
    void Study() {
        System.out.println("Studying1 ");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // polymorphism
        // many forms

        // int a = 5;
        // int b = 10;
        // System.out.println(a + b); // plus sign + -> addition

        // String c = "Hello";
        // String d = "World";
        // System.out.println(c + d); // + sign -> concatenation

        // UPCASTING
        Student s1 = new Student1();
        s1.Study();

    }
}

// TYPES
// 1. Static Polymorphism (Early Binding)
// - It is a type of polymorphism that resolves at compile time
// example -> Method overloading

// 2. Dynamic Polymorphism (Late Binding)
// it is a type of polymorphism that resolves at runtime
// example -> Method overriding
