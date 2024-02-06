class Bank {
    private int accNumber = 1234;
    private String myName = "MoshiMoshi";
    private int amount;
    // instead of declaring it public, add a layer of security( and use a public
    // method of getters and setters

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        // "this keyword" (when same name for instance variable and local variable)
        // accNumber = accNumber -> X -> it will consider both as local variable only
        // (priorities!)

        // for this reason this. is used
        this.accNumber = accNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return myName;
    }

    public void setName(String name) { // to change name
        myName = name;
    }

}

public class encapsule {
    public static void main(String[] args) {
        // ENCAPSULATION
        // Wrapping data and member functions together in a single unit
        Bank obj1 = new Bank();

        // obj1.accNumber = 12345; | BAD
        // obj1.myName = "Hello"; | PRACTICE
        // obj1.amount = 50; | !!!

        System.out.println(obj1.getAccNumber() + " " + obj1.getName() + " ");
        obj1.setName("Hello");
        System.out.println(obj1.getAccNumber() + " " + obj1.getName() + " ");
    }
}

// It provides control over the data
// It is a way of achieving data hiding because other classes won't be able to
// access the data through private data member
