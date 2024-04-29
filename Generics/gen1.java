class A<T> {
    T a;

    public A(T a) {
        this.a = a;
    }

    public T getValue() {
        return a;
    }
}

public class gen1 {
    public static void main(String[] args) {
        A<Integer> a1 = new A<>(5);
        System.out.println(a1.getValue()); // 5
    }
}
