// class A implements Runnable {
//     public void run() {
// for (int i = 1; i <= 10; i++) {
//     System.out.println(i);
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
// for (int i = 10; i <= 20; i++) {
//     System.out.println(i);
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Increment {
    int value;

    public synchronized void inc() {
        value++;
    }
}

public class thread_prac {
    public static void main(String[] args) throws InterruptedException {
        Increment i1 = new Increment();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                i1.inc();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                i1.inc();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i1.value);

    }
}

// import java.time.*;
// import java.util.*;
// import java.time.format.DateTimeFormatter;

// class Main {
// public static void main(String... args) {
// Scanner sc = new Scanner(System.in);
// String d = sc.nextLine();
// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
// LocalDateTime DATE = LocalDateTime.parse(d, dtf);
// System.out.println(DATE);
// // ZonedDateTime zdt = ZonedDateTime.of(DATE,)
// // ZoneDateTime zdt = ZonedDateTime

// }
// }