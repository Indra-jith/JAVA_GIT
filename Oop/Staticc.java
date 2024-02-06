class Student {
    public String studentName;
    public int rollNo;
    public static String universityName; // same for every student so "static"
    // common entity shared by all objects of class

    public void output() {
        System.out.println(studentName + " " + rollNo + " " + universityName);
    }
}

public class Staticc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentName = "Karthik";
        s1.rollNo = 1;
        s1.universityName = "LPU"; // same

        Student s2 = new Student();
        s2.studentName = "Tanish";
        s2.rollNo = 2;
        s2.universityName = "LPU"; // same

        s1.output();
        s2.output();
    }
}
