class A extends Thread {
    public void run() { // It should be "run" (no other names)
        // Thread -> runnable -> which is a functional interface with method "run"
        // therefore if using thread, use run method
        for (int i = 0; i <= 20; i++) {
            System.out.println("Executing A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("From B");
        }
    }
}

public class threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start(); // use start
        obj2.start(); // same here
        // (without thread keyword) -> not multitasking
    }
}
