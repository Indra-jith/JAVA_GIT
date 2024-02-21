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
        new Calculation(0);
        // object created without storing location in a reference variable

    }
}
