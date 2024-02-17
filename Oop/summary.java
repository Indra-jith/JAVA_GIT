public class summary {
    public int rollno;
    public String name;
    public static String university = "LPU";

    public summary(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void setData(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;

    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name is " + name;
    }

    public String getuni() {
        return university;
    }

    public static void main(String[] args) {
        summary s1 = new summary(26, "Devika");
        // s1.setData(26, "Devika");
        summary s2 = new summary(25, "Indra");
        // s2.setData(25, "Indra");
        // System.out.println(s2.getRollno());
        System.out.println(s1);
        System.out.println(s2.getuni());
    }
}
