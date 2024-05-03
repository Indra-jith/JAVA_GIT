import java.util.*;

public class banana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpuString = scanner.nextLine().trim();
        String arr[] = inpuString.split(" ");
        ArrayList<String> list = new ArrayList<>();
        String pattern = "[a-zA-Z]+";
        for (String word : arr) {
            if (word.matches(pattern)) {
                list.add(word);
            }
        }
        int max_length = list.get(0).length();
        for (String word : arr) {
            if (word.length() > max_length) {
                max_length = word.length();
            }
        }
        for (String word : arr) {
            if (word.length() == max_length) {
                System.out.println(word);
            }
        }
    }
}
