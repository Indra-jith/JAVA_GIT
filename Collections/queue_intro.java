import java.util.*;

public class hashmap_intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase().trim().replaceAll(",", "");
        scanner.close();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String arr[] = sentence.split(" ");
        for (String word : arr) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}
