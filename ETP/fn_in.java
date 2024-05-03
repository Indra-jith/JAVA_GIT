@FunctionalInterface
interface A {
    void print(String word);

    default void hello() {

    }

    static void hello1() {

    }
    // void hello();
}

// class B implements A{
// public void print()
// {
// System.out.println("hello");
// }
// }
public class fn_in {
    public static void main(String[] args) throws InterruptedException {
        A a = (String word) -> {
            System.out.println("hello everynann " + word);

        };
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Runnable obj2 = () -> {
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
            }
        };
        a.print("babluch");
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread1.join();
        thread2.sleep(100);
        thread2.start();
        thread2.join();
    }
}
