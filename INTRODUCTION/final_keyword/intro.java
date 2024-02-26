class Car {
    final int price = 100;

    final void Drive() {
        System.out.println("Car is driving");
    }
}

class Ford {
    void Drive() {
        System.out.println("Ford is driving");
    }
}

class Bike {
    // we cannot make constructor final
    Bike() {

    }

    final void Ride() {

    }
}

class Yamaha extends Bike {
    // new Yamaha().Ride();
}

public class intro {
    public static void main(String[] args) {
        Car c1 = new Car();
        // c1.price = 200; // we are able to change without the final keyword
        System.out.println(c1.price);
        c1.Drive();
        Ford f1 = new Ford();
        f1.Drive();
    }
}

// if we make a variable as final, we cannot change the value of it(constant)
// if we make a method as final, we cannot override it
//