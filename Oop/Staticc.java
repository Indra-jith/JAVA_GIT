class Student {

  public String studentName;
  public int rollNo;
  public static String universityName; // same for every student so "static"

  // common entity shared by all objects of class
  // public and static are interchangeable
  // static public... also works
  public void output() {
    System.out.println(studentName + " " + rollNo + " " + universityName);
  }

  public static void myStaticMethod(){
	System.out.println("From static method" + " " +universityName); //can only add static variable inside a static method
	//if you want to call a static you should specify obj as a parameter
	//public static void myStaticMethod(obj b1){ and provide in main method
  }
}

// Static keyword -> for memory management
// A static variable can be used to refer to the common property at all objects
// A static variable gets memory only once in class area at the time of class loading
public class Staticc {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.studentName = "Karthik";
    s1.rollNo = 1;
    s1.universityName = "LPU"; // same, just this one is enough(because of static keyword)

    Student s2 = new Student();
    s2.studentName = "Tanish";
    s2.rollNo = 2;
    // s2.universityName = "LPU"; // same

    Student s3 = new Student();
    s3.studentName = "Anil";
    s3.rollNo = 66;
    //no need to even put univeristy name

    s1.output();
    s2.output();
	Student.myStaticMethod(); //No need of object
  }
}

// Difference in instance and static variables

/*
	- Instance variables are declared in a class but outside a method
	- Class/static variables are declared with a static keyword in a class but outisde a methi

	- Instance variable are created when an object is created with the use of new keyword
	- and they get destroyed when the object is destroyed
	- Static variables are created when the program starts and destroyed when the program stops.

	- Instance variables can be accessed directly by calling variable name inside the class
	- Static variables can be accessed by calling with the class name


*/