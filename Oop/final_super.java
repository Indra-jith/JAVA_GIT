/*
 * FINAL
 * final class -> using the keyword final
 * does not allow other classes to be a sub class of its own (aka bye bye inheritance)
 * final methods -> prevents overriding of final methods
 * final variable -> assigned ONE time!
 */

/*
 * SUPER
 * super keyword -> is used to access something from a parent class
 * (like an overriden method)
 * cannot access private methods tho
 * to access parent class's constructor  ->  super(para1,para2) (note : it should be first line in sub class constructor)
 * fun fact : a sub class constructor automatically calls super() (without para) without us doing anything
 */
final class thalaiva { // cannot have any subclass (child classes)
    void mass() {
        System.out.println("mass mass");
    }
}
// class newgen extends thalaiva{ --> error

// }

class test {
    final void f1() { // cannot be overwritten
        System.out.println("og");
    }

    int a;
    int b;

    test(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class test1 extends test {
    int c;

    test1(int a, int b, int c) {
        super(a, b); // use of super
        this.c = c;
    }
    // void f1() -> error (cannot override a final method)
    // {

    // }
}

public class final_super {
    public static void main(String[] args) {
        thalaiva t1 = new thalaiva();
        t1.mass();
        final float pi = 3.14f;
        // pi=3.144f; error -> can be only assigned once (already did above)

    }
}
