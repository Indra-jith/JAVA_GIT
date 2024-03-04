
// interface Flyable {
// public void fly_obj();
// }

// class Spacecraft implements Flyable {
// public void fly_obj() {
// System.out.println("Spacecraft is flying");
// }
// }

// class Airplane implements Flyable {
// public void fly_obj() {
// System.out.println("Airplane is flying");
// }
// }

// class Helicopter implements Flyable {
// public void fly_obj() {
// System.out.println("Helicopter is flying");
// }
// }

// public class interface_problem {
// public static void main(String[] args) {
// Spacecraft s1 = new Spacecraft();
// Airplane a1 = new Airplane();
// Helicopter h1 = new Helicopter();
// s1.fly_obj();
// a1.fly_obj();
// h1.fly_obj();
// }
// }

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter");
    }
}

public class interface_problem {
    public static void main(String args[]) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}