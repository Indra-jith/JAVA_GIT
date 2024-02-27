abstract class Car {
    void Drive() {
        System.out.println("Drive");
    }

    void Brake() { // concrete methods
        System.out.println("Brakee");
    }

    // abstract methods
    abstract void Speed(); // Not defining it here
    // Abstract this
    // only abstract method in an abstract class
}

class Ford extends Car { // now this should define speed
    void Speed() {
        System.out.println("Speed");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // Car c1 = new Car(); //error
        // we cannot create an object for an abstract class
        Car c1 = new Ford(); // up casting
        c1.Drive();
        c1.Speed();
    }
}
// Abstract class - > Declared with abstract keyword
/*
 * It can have abstract and non abstract(concrete) methods
 * It cannot be instantiated ( we use upcasting or something)
 * An abstract class must be declared with abstract keyword
 * It can have constructors and static methods
 * 
 */