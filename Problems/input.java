import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string(your name): ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);
    }
}
