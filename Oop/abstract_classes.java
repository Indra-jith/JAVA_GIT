abstract class Animal {
    int age;
    int legs;

    // makes sure every single animal type does something for sure
    public abstract void makenoise();
}

class Cat extends Animal {
    public void makenoise() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    public void makenoise() {
        System.out.println("Bow");
    }
}

// class that you can't create an object of -> abstract class
public class abstract_classes {
    public static void main(String[] args) {
        // class that you can't create an object of
        Cat c1 = new Cat();
        c1.makenoise();
    }
}
