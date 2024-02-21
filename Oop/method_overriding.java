// must have same name and signature (method in parent and child)
class Bank {
    public int getLoanInterest() { // same name same signature
        return 7;

    }
}

class ICIC extends Bank {
    public int getLoanInterest() { // same name same signature
        return 10;
    }
}

class SBI extends Bank {

}

public class method_overriding {
    public static void main(String[] args) {
        ICIC bank1 = new ICIC();
        System.out.println(bank1.getLoanInterest()); // child overrides parents method

    }
}
/*
 * Method overriding is used to provide specific implementation of the method
 * that is already
 * provided by its parents class
 */
// The method must have the same name as in parent class
// the method must have same paramters as in parent class
