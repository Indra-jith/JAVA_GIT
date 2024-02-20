// -------------------SINGLE INHERITANCE --------------------------
// single parent single child

// class Animal { // parent
//     public void eat() {
//         System.out.println("I can eat!");
//     }

// }

// keyword -> extends
// Child class
// class Dog extends Animal { // Dog has access to Animal (not vice versa)
//     public void bark() {
//         System.out.println("I can bark");
//     }
// }

//---------------------------------------------------------

//----------------------MULTILEVEL INHERITANCE----------------------
//single parent->single child->single grandchild

// class Animal {
//     public void eat() {
//         System.out.println("I can eat!");
//     }

// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("I can bark");
//     }
// }

// class BabyDog extends Dog { // can eat,bark and cry as well
//     public void cry() {
//         System.out.println("i'll cry most of the time");
//     }
// }
//-----------------------------------------------------------------------------

//------------------------HEIRARCHICAL INHERITANCE----------------------------------
//single parent, 2 childs

// class Animal {
//     public void eat() {
//         System.out.println("I can eat!");
//     }

// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("I can bark");
//     }
// }

// class Tiger extends Animal {
//     public void roar() {
//         System.out.println("I can roar!");
//     }
// }

// ------------------------------------------------------------------------------------
// multiple inheritance not possible (can be with interfaces)
class A {
    void print() {
        System.out.println("From a");
    }
}

class B {
    void print() {
        System.out.println("From b");
    }
}

// class C extends A,B{ //will become confusing which print (a or b)
// not possible (multiple inheritance)
// }

public class inheritance {
    public static void main(String[] args) {
        // Inheritance
        // Dog d1 = new Dog();
        // d1.eat(); // possible

        // BabyDog b1 = new BabyDog();
        // b1.bark();
        // b1.eat();
        // b1.cry();

        // Tiger t1 = new Tiger();
        // // t1.bark(); //not possible
        // t1.eat();
        // t1.roar();

    }
}
