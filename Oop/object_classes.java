// toString Method, equals method
// we are basically overriding object functions
class Phone {
    String model;
    int price;

    public String toString() {
        return "Hello";
    }

    public boolean equals(Phone other) {
        if ((this.model.equals(other.model)) && (this.price == (other.price))) {
            return true;
        } else {
            return false;
        }
    }

}

public class object_classes {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.model = "iphone";
        obj.price = 100;
        Phone obj1 = new Phone();
        obj1.model = "iphone";
        obj1.price = 100;
        // obj.model = "iphone";
        // without overriding toString()

        // System.out.println(obj); // Phone@28a418fc
        // System.out.println(obj.toString()); // Phone@28a418fc
        // same thing

        // System.out.println(obj1); // Phone@5305068a

        // we will override it now
        System.out.println(obj); // Hello
        System.out.println(obj.toString()); // Hello

        // before overriding equals
        // boolean check1 = obj.equals(obj1);
        // System.out.println(check1); // false
        // (doesn't make sense)

        // after
        boolean check = obj.equals(obj1);
        System.out.println(check); // true
    }
}