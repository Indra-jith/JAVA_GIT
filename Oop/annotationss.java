class A {
    void thenameofthemethodIsveryverylong() {
        System.out.println("From A");
    }
}

class B extends A {
    @Override // imp
    void thenameofthemethodIsveryverylong() {
        System.out.println("From B");
    }
}

public class annotationss {
    public static void main(String[] args) {
        B obj = new B();
        obj.thenameofthemethodIsveryverylong();
    }
}
