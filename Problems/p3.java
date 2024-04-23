class Circle {
    private double radius;

    public void setValue(double radius) {
        this.radius = radius;
    }

    public double getValue() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class p3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setValue(10);
        System.out.println("Radius of circle is " + c1.getValue());
        System.out.println("Area of circle is " + c1.calculateArea());
        System.out.println("Perimeter of circle is " + c1.calculatePerimeter());
    }
}
