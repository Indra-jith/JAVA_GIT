// class Vechicle {
// final int year; // can be only assigned once;
// float weight;

// Vechicle(int year, float weight) {
// this.year = year;
// this.weight = weight;
// }

// void speed() {
// System.out.println(100);
// }

// void speed(int a) {
// System.out.println("hello");
// }

// }

// class Car extends Vechicle { // single inheritance // -------
// boolean sports;

// Car(int year, float weight, boolean sports) {
// super(year, weight);
// this.sports = sports;
// }

// void speed() {
// System.out.println(200);
// }

// public String toString() {
// return "Car Details : " + year + " build weighing over " + weight + "pounds";
// }

// public boolean equals(Car obj) {
// return (this.year == obj.year);
// }
// }

// final class Bike extends Vechicle { // heirarchical inheritance //---------
// String exhaust;

// Bike(int year, float weight, String exhaust) {
// super(year, weight);
// this.exhaust = exhaust;
// }

// void speed() {
// System.out.println(70);
// }

// public boolean equals(Bike obj) {
// return (this.year == obj.year);
// }
// }
// // class Kutticycle extends Bike{ //not possible

// // }

// // class Cycle extends Bike { // multi level inheritance
// // boolean childsupport;
// // }

// public class ca2_prep {
// public static void main(String[] args) {
// Car c1 = new Car(2003, 100, true);
// Car c2 = new Car(2003, 200, false);
// System.out.println(c1.toString());
// System.out.println(c1.equals(c2));
// System.out.println(c1 instanceof Car);
// Vechicle v1 = new Vechicle(2003, 100);
// v1.speed();
// v1.speed(10);
// }
// }
// import java.util.Scanner;

// abstract class Shape {
// public abstract double calculateArea();

// public abstract void setValues();
// }

// class Circle extends Shape {
// int radius;

// public void setValues() {
// System.out.println("Enter the radius for Circle: ");
// Scanner scanner = new Scanner(System.in);
// int r = scanner.nextInt();
// this.radius = r;
// }

// public double calculateArea() {
// double area = Math.PI * radius * radius;
// return area;
// }

// public String toString() {
// return "Circle details:\n" + "Radius: " + radius + "\nArea: " +
// calculateArea();
// }
// }

// class Rectangle extends Shape {
// int width;
// int height;

// public void setValues() {
// System.out.print("Enter the height and width for Rectangle: ");
// Scanner scanner = new Scanner(System.in);
// int h = scanner.nextInt();
// scanner.nextLine();
// int w = scanner.nextInt();
// this.height = h;
// this.width = w;
// }

// public double calculateArea() {
// double area = width * height;
// return area;
// }

// public String toString() {
// return "Rectangle details:\n" + "Width: " + width + "\nHeight: " + height +
// "\nArea: " + calculateArea();
// }
// }

// public class ca2_prep {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// Circle c1 = new Circle();
// c1.setValues();
// System.out.println(c1.toString());

// Rectangle r1 = new Rectangle();
// r1.setValues();
// System.out.println(r1.toString());
// scanner.close();
// }
// }

// @FunctionalInterface
// interface Vehicle {
// int i = 1;

// // abstract void rev();

// abstract void sup();

// default void greeting() {
// System.out.println("hello");
// }
// }

// class Car implements Vehicle {
// static int i;

// public void sup() {
// System.out.println("grrr");
// }

// }

// public class ca2_prep {
// public static void main(String[] args) {
// Vehicle v1 = () -> {
// // public void rev() {
// // System.out.println("revv");
// // }

// // public void sup() {
// System.out.println("supp");
// };
// // };
// // v1.rev();
// v1.sup();
// }

// }

// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i < 10; i++) {
//             System.out.println(i);
//             try {
//                 Thread.sleep(10000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 11; i < 20; i++) {
//             System.out.println(i);
//         }
//     }
// }

// public class ca2_prep {
//     public static void main(String[] args) {
//         Runnable a = () ->
//         {
//             for (int i = 1; i < 10; i++) {
//                 System.out.println(i);
//                 try {
//                     Thread.sleep(10000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         };
//         B b = new B();
//         Thread t1 = new Thread(a);
//         Thread t2 = new Thread(b);
//         // t1.setPriority(10);
//         t1.start();
//         t2.start();
//     }
// }

// class Increment {
//     int i;

//     void inc() {
//         i++;
//     }

//     void dec() {
//         i--;
//     }
// }

// public class ca2_prep {
//     public static void main(String[] args) throws InterruptedException {
//         Increment i1 = new Increment();
//         Runnable obj1 = () -> {
//             for (int i = 0; i < 100; i++) {
//                 i1.inc();
//             }
//             System.out.println(i1.i);
//         };
//         Runnable obj2 = () -> {
//             for (int i = 0; i < 100; i++) {
//                 i1.dec();
//             }
//             System.out.println(i1.i);
//         };
//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);
//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();
//     }
// }

// import javax.swing.*;
// import java.awt.event.ActionEvent;

// public class ca2_prep {

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Button Example");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JButton button = new JButton("Click Me");

//         // Use lambda expression to define action listener
//         button.addActionListener(e -> {
//             System.out.println("Button Clicked!");
//             // You can add more logic here, like changing button text or performing
//             // calculations
//         });

//         frame.add(button);
//         frame.pack();
//         frame.setVisible(true);
//     }
// }

// import java.util.Vector;

class Vehicle {
    int i;

    static class Car {
        public void moshi() {
            System.out.println("moshi");
        }
    }

    public void greetin() {
        System.out.println("hello");
    }
}

public class ca2_prep {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle();
        // Vehicle.Car c1 = v1.new Car();
        // System.out.println(c1.tyre);
        Vehicle v1 = new Vehicle();
        Vehicle c1 = new Vehicle() {
            // @Override
            public void greetin() {
                System.out.println("no hello for you");
            }
        };
        Vehicle.Car c3 = new Vehicle.Car();
        Vehicle.Car c2 = new Vehicle.Car() {
            public void moshi() {
                System.out.println("moshi moshi");
            }
        };
        v1.greetin();
        c1.greetin();
        c3.moshi();
        c2.moshi();
    }
}