import java.util.*;

class ShreyaException extends Exception {
    public ShreyaException(String message) {
        super(message);
    }
}

public class custom_exc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                throw new ShreyaException("here");
            }
        } catch (ShreyaException e) {
            System.out.println(e.getMessage());
        }
    }
}
