import java.util.Scanner; //needed

public class user_input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = a.nextLine();
        // If you use a.next() -> only first name will be read (won't be read after
        // space)
        System.out.println("Name : " + name);
        System.out.println("Enter your age: ");
        int age = a.nextInt();
        a.nextLine();
        System.out.println("Age : " + age);
        char c = a.nextLine().charAt(0);
        System.out.println(c);
        a.close();
    }
}
