/*
    - A constructor is a block of code similar to a class
    - It is called when an instance of class is created
    - Everytime an object is created using the new keyword,
      atleast one constructor is called.
    - Java compiler provides a default constructor by default, this
      constructor is called if there is no constructor available in the 
      class
    
    RULES
    -> Constructor name must be same as its class name
    -> Constructor should not have a return type

*/

class Person{
    public String name;
    public int age;
    public int mob;

    // To create a constructor
    // The name should be name as class Name and 
    // It should not have any return type
    // it automatically gets called once an object is created (we dont have to specifically call it)
    // Even if you don't mention a constructor, JVM calls a DEFAULT CONSTRUCTOR everytime an
    // object is created for a class.
//-----------------------------------------------------------
    // DEFAULT CONSTUCTOR
    public Person(){
        System.out.println("From consructor");
    }

    // PARAMETERISED
    public Person(String name,int age,int mob) // Parameterized COnstructor
    {
        this.name = name;
        this.age = age;
        this.mob = mob;
    }

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    //COPY CONSTRUCTOR
//-----------------------------------------------------------
    public void output(){
        System.out.println("Name : "+name+" Age : "+age+" Mob : "+mob);
    }
}

public class constructor{
    public static void main(String args[])
    {
        Person p1 = new Person(); // Constructor method is called automatically
        p1.output();

        Person p2 = new Person("Hello",22,1234);
        p2.output();

        Person p3 = new Person("Moshi",21);
        p3.output(); // mob will be 0

    }
}