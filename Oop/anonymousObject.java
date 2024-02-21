class Calculation {
    public int a;

    public Calculation(int a) {
        this.a = a;
    }

    public void area() {
        int area = a * a;
        System.out.println("Area : " + area);
    }

    public void perimeter(int b) {
        int perimeter = 4 * b;
        System.out.println("Perimeter: " + perimeter);
    }
}

public class anonymousObject {
    public static void main(String[] args) {
        new Calculation(0); // -> Anonymous object
        // // object created without storing location in a reference variable
        new Calculation(10).area(); // can be used
        // BUT we won't be able to do anything like change the area after this

        // Used when you need to create an object ONCE in your code
        // you can do it this way without creating a reference variable
    }
}
