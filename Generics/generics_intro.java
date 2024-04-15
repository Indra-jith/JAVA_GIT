class GenericClass<T> { // generic class
    T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class Test {
    public <T> void genericMethod(T data) { // generic method
        System.out.println("From generic method :" + data);
    }
}

// What if we want to restrict to certain data types (Example : only Numbers)
class GenericClass2<T extends Number> {
    void print() {
        System.out.println("From Bounded generic class");
    }
}

public class generics_intro {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass(5);
        System.out.println(obj1.getData());

        GenericClass<String> obj2 = new GenericClass("Hello");
        System.out.println(obj2.getData());

        GenericClass2<Integer> obj3 = new GenericClass2();

        Test t1 = new Test();
        t1.genericMethod(10);
        t1.genericMethod("Hello");
    }
}
