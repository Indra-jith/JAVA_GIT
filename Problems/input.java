import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string(your name): ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
