class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Student {
    int id;
    String name;
    Address address; // important

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("ID : " + id + " | " + "Name : " + name + " | " + "address: " + address.state);
    }
}

public class aggregation {
    public static void main(String[] args) {
        Address a1 = new Address("Kochi", "Kerala");
        Student s1 = new Student(1, "john", a1);
        s1.display();

    }
}
