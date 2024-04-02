import java.util.ArrayList;

class Student {
    ArrayList<String> list;

    Student() {
        list = new ArrayList<>();
    }

    public void addStudent(String name) {
        list.add(name);
    }

    public void removeStudent(String name) {
        list.remove(name);
    }

    public void displayAllStudents() {
        System.out.println("List of students " + list);
    }
}

public class arraylist_probb {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.addStudent("Naruto");
        s1.addStudent("Ichigo");
        s1.addStudent("Saitama");
        s1.addStudent("Luffy");
        s1.removeStudent("Saitama");
        s1.displayAllStudents();

    }
}
