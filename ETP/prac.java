import java.util.*;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.trim().split(" ");
        int max_freq = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : arr) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }
        int removed = 0;
        ArrayList<String> list = new ArrayList<>();
        Set<String> kset = (map.keySet());
        for (String key : kset) {
            if (map.get(key) > max_freq) {
                removed++;
            } else {
                list.add(key);
            }
        }
        if (removed == 0) {
            System.out.println("No elements removed");
        }
        System.out.println(list);
        list.add();
        ArrayDeque<String> ard = new ArrayDeque<>();
        
    }
}
