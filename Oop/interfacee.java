class Nonveg {
    void eat() {
        System.out.println("Non veg food");
    }
}

class Veg {
    void eat() {
        System.out.println("veg food");
    }
}

class Dog {
    void eating(Veg item) { // dog is dependant on veg (sad!)
        item.eat();
    }
}

public class interfacee {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Veg v1 = new Veg();
        d1.eating(v1);
        Nonveg n1 = new Nonveg();
        // d1.eating(n1); // error
        n1.eat();
    }
}