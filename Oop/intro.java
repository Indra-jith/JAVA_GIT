class Calculate { // template(blueprint) just define how calculation is going to work
    // method
    // access_modifier return_type name_of_method()
    // {
    //
    // }
    public void test() {
        System.out.println("From test");
    }

    public int sub() {
        return 99;
    }

    public int add(int a, int b) // whenever we call add, it needs 2 arguments(2 integers)
    {
        return a + b;
    }

    // public void test() {
    // System.out.println("From test");
    // }
}

public class intro {
    public static void main(String args[]) {
        /*
         * Object and Classes
         * Object -> Attributes(var) & behaviours (methods)
         * Class -> is like a template
         */
        // new Calculate(); // to get access to calculate (made in a different memory ->
        // HEAP)
        /*
         * 2 Types of memory functioning here ->
         * STACK(LIFO) -> here all variables, and all work here
         * HEAP(dynamic memory) -> when new calculate() -> a new object is created in
         * heap, but we cannot exactly dereference/ find in heap directly(like stack)
         * (It is created in a random address)
         * THEREFORE A REFERENCE VARIABLE IS CREATED IN STACK
         */
        Calculate obj = new Calculate(); // pointing towards type calculate (and towards a new Calculate object)
        // obj is reference towards the object
        obj.test();
        int v = obj.sub(); // because it is returning something
        System.out.println(v); // 99
        int sum = obj.add(1, 2);
        System.out.println(sum); // 3
    }
}