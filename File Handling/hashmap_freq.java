import java.util.Map;
import java.util.HashMap;

public class hashmap_freq {
    public static void main(String[] args) {
        String str = "hello this is the text that i was talking abou the";
        Map<String, Integer> freqMap = new HashMap<>();
        String strarr[] = str.split(" ");
        for (String word : strarr) {
            if (!freqMap.containsKey(word)) {
                freqMap.put(word, 1);
            } else {
                int count = freqMap.get(word);
                freqMap.put(word, count + 1);
            }
        }
        int maxfreq = 0;
        String maxfreqString = strarr[0];
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            // if (entry.getKey().equals("the")) {
            // System.out.println(entry.getValue());
            // }
            String k = entry.getKey();
            int f = entry.getValue();
            if (f > maxfreq) {
                maxfreq = f;
                maxfreqString = k;
            }
        }
        System.out.println(maxfreqString);
    }
}
