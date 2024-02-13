import java.util.Scanner;

public class temperature_with_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature in degree celsius: ");
        float degree = scanner.nextFloat();
        float farheh = (degree * 9 / 5) + 32;
        System.out.println(degree + " degrees is equal to " + farheh + " farhenheit");
        scanner.close();
    }
}
