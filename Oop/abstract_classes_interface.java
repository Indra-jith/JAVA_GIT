/*
 * Abstract classes - you can't create ab object of that class 
 * abstract methods in a class should be implemented in sub classes (mandatory)
 */

/*
 * Interface - similar to abstract class, whatever methods inside abstract class, you don't
   have to give keyword abstract, everything is abstract is by default
   but variables is final and static, there should be initialization

   Advantage - multiple inheritance possible only in interface
   class A implements interface1,interface2
 */

interface Animal1 {
    void eat();
}

interface Animal2 {
    void sleep();
}

abstract class Animal {
    int legs;
    int tail;

    public void introduce() {
        System.out.println("Hello! this is not mandatory for every subclass");
    }

    public abstract void sound(); // but this is mandatory (only declaration, each subclass can have it's own
                                  // definition)
}

class Dog extends Animal {
    // not compulsory to give legs,tails,or introduce, but sound is compulsory
    public void sound() {
        System.out.println("Bow bow");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow meow");
    }
}

class superDog implements Animal1, Animal2 { // need to have both eat and sleep
    public void eat() {
        System.out.println("eating");
    }

    public void sleep() {
        System.out.println("sleeping");
    }
}

public class abstract_classes_interface {
    public static void main(String[] args) {
        // Animal a1 = new Animal(); -> not posssible, only objects of sub class of an
        // abstract class is possible
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
        superDog s1 = new superDog();
        s1.eat();
        s1.sleep();
    }
}
