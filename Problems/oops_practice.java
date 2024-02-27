/*//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape. */
class Shape {
    void draw() {
        System.out.println("Drawing");
    }

    float calculateArea() {
        return 0.0f;
    }
}

class Circle extends Shape {
    float radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    float calculateArea() {
        return 3.14f * radius * radius;
    }
}

class Square extends Shape {
    float side;

    Square(float side) {
        this.side = side;
    }

    void draw() {
        System.out.println("Drawing Square");
    }

    float calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    float base;
    float height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing Triangle");
    }

    float calculateArea() {
        return 0.5f * base * height;
    }
}

public class oops_practice {
    public static void main(String[] args) {

        Square s1 = new Square(10);
        s1.draw();
        System.out.println("Area: " + s1.calculateArea());
        Circle c1 = new Circle(24);
        c1.draw();
        System.out.println("Area: " + c1.calculateArea());
        Triangle t1 = new Triangle(10, 20);
        t1.draw();
        System.out.println("Area: " + t1.calculateArea());

    }
}
