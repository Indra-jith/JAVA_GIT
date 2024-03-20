class C {

}

// class A implements Runnable {
// public void run() { // It should be "run" (no other names)
// // Thread -> runnable -> which is a functional interface with method "run"
// // therefore if using thread, use run method
// for (int i = 0; i <= 20; i++) {
// System.out.println("Executing A");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } // will wait 10 milli second before executing next one
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (int i = 0; i <= 20; i++) {
// System.out.println("From B");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// }

public class runnablee {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            // public void run() { // It should be "run" (no other names)
            // Thread -> runnable -> which is a functional interface with method "run"
            // therefore if using thread, use run method
            for (int i = 0; i <= 5; i++) {
                System.out.println("Executing A");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } // will wait 10 milli second before executing next one
            }
            // }
        };
        Runnable obj2 = new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("From B");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        // obj1.start(); //error without thread
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
