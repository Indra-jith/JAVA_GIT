// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.

class Vehicle {
    public String identificationNumber;
    public double maxSpeed;

    public void setVehicleDetails(String identificationNumber, double maxSpeed) {
        this.identificationNumber = identificationNumber;
        this.maxSpeed = maxSpeed;
    }

    public void getVehicleDetails() {
        System.out.println("Identification Number : " + identificationNumber);
        System.out.println("Maximum speed : " + maxSpeed);
    }
}

class Car extends Vehicle {
    private int maxPassengers;

    public Car(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void getCarDetails() {
        System.out.println("Maximum number of passengers: " + maxPassengers);
    }
}

class Truck extends Vehicle {
    private double maxWeight;

    public Truck(double d) {
        this.maxWeight = d;
    }

    public void getTruckDetails() {
        System.out.println("Maximum Weight it can carry: " + maxWeight);
    }
}

class Bicycle extends Vehicle {

}

public class inheritance_problen {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setVehicleDetails("ABC", 0);

        Car c1 = new Car(7);
        c1.setVehicleDetails("HONDA", 250);
        c1.getVehicleDetails();
        c1.getCarDetails();

        Truck t1 = new Truck(200.57);
        t1.setVehicleDetails("BENZ", 70);
        t1.getVehicleDetails();
        t1.getTruckDetails();

        Bicycle b1 = new Bicycle();
        b1.setVehicleDetails("BMX", 50);
        b1.getVehicleDetails();

    }
}
