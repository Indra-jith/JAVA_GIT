/*
 * Default methods
 * Interface upto older version 1.7 -> declare only (no definition)
 * but from 1.8 -> we can define methods in interface using "default" keyword
 * 
 */

/*
 * Static methods
 * can be directly called without creating an object of a class
 * if giving variables or anything inside definition, make sure to include static variables only
 */
interface Test {
    void old();

    int x = 1; // needs to be defined(even in older versions)

    default void update() { // can be overrided as well
        System.out.println("we can do this in interface now by using default keyword");
    }
}

// we cannot create an instance of interface so create a class which implements
// an interface
class Demo implements Test {
    public void old() {
        System.out.println("hmm");
    }

    public void update() {
        System.out.println("overrided default method");
    }

    int a = 10;
    static int b = 20;

    public void non_static() {
        System.out.println("non static(instance) method -> This needs an object like obj.non_static");
        System.out.println("And it can include both static and non static variables like " + a + " " + b);
    }

    static void staticc() {
        System.out.println("Static method ->This can be called directly with class name like Class.staticc()");
        System.out.println("And it can include only static variables like" + " " + b);
    }

    static void staticc(Demo d1) {
        System.out.println("And if you give obj as parameter it can include both static and non static variables like "
                + d1.a + " " + b);
    }
}

public class default_and_static {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.old();
        d1.update();
        d1.non_static();
        Demo.staticc(); // with class name
        Demo.staticc(d1); // with parameter to access non static variables as well
    }
}
