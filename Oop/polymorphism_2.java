// Late Binding
class Bank {
    float interest() {
        return 7;
    }
}

class Bank1 extends Bank {

}

class Bank2 extends Bank {
    float interest() {
        return 10.0f;
    }
}

public class polymorphism_2 {
    public static void main(String[] args) {
        Bank b1;
        b1 = new Bank1();
        System.out.println(b1.interest());
        b1 = new Bank2();
        System.out.println(b1.interest());
    }
}
