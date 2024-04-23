import java.util.*;

public class g1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // JAVA string program to check for Anagram
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        char arr1[] = input1.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Character.toLowerCase(arr1[i]);
        }
        char arr2[] = input2.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Character.toLowerCase(arr2[i]);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not anagram");
        }

    }
}
