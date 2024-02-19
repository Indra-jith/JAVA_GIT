class Animal { // parent
    public void eat() {
        System.out.println("I can eat!");
    }

}

// keyword -> extends
// Child class
class Dog extends Animal { // Dog has access to Animal (not vice versa)
    public void bark() {
        System.out.println("I can bark");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Inheritance
        Dog d1 = new Dog();
        d1.eat(); // possible
    }
}
