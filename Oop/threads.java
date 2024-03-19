class A extends Thread {
    public void run() { // It should be "run" (no other names)
        // Thread -> runnable -> which is a functional interface with method "run"
        // therefore if using thread, use run method
        for (int i = 0; i <= 20; i++) {
            System.out.println("Executing A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // will wait 10 milli second before executing next one
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("From B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        // min priority - max priority (1 to 10)

        // to change priority (we can only optimize it, not change the algo)
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start(); // use start
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start(); // same here
        // (without thread keyword) -> not multitasking
    }
}