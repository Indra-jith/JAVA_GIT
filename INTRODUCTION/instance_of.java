class Animal {

}

class Dog extends Animal {

}

public class instance_of {
    public static void main(String[] args) {
        // instance_of a = new instance_of();
        // System.out.println(a instanceof instance_of); // true
        // checks if a is an object of the class "instance_of"
        // instanceof -> operator

        // String st = new String();
        // System.out.println(st instanceof String); // true

        // Dog d1 = new Dog();
        // System.out.println(d1 instanceof Dog); // true
        // System.out.println(d1 instanceof Animal); // true as well (even with parent
        // case)

        // Down Casting
        // Dog d1 = new Animal(); // sub class(child class) type refers to object of
        // parent classs
        // // child = new parent

        // Up Casting
        // Animal a1 = new Dog(); // A parent class type refers to object od child class
        // parent = new child
        // permittable

    }
}
