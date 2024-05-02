import java.util.*;

public class flip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        String bString1 = Integer.toBinaryString(num1);
        StringBuilder b1 = new StringBuilder(bString1);
        String bString2 = Integer.toBinaryString(num2);
        StringBuilder b2 = new StringBuilder(bString2);
        int maxlength = 0;
        while (b1.length() != b2.length()) {
            if (b1.length() < b2.length()) {
                b1.insert(0, "0");
            } else {
                b2.insert(0, "0");
            }
        }
        int count = 0;
        for (int i = 0; i < b1.length(); i++) {
            if (b1.charAt(i) != b2.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
