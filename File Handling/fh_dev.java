import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class fh_dev {
    public static void main(String[] args) {
        try {
            File obj = new File("bablu.txt");
            BufferedReader reader = new BufferedReader(new FileReader(obj));
            String line;
            StringBuilder content = new StringBuilder();
            // StringBuilder linerev = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // linerev.append(line);
                // linerev.reverse();
                content.append(line + " ");
                // linerev.setLength(0);
            }
            String finalstr = content.toString();

            System.out.println(finalstr);
            reader.close();

            Map<String, Integer> freqMap = new HashMap<>();
            String[] arr = finalstr.split(" ");
            for (String word : arr) {
                if (!freqMap.containsKey(word)) {
                    freqMap.put(word, 1);
                } else {
                    int count = freqMap.get(word);
                    freqMap.put(word, count + 1);
                }
            }
            int mostrepeatingfreq = 0;
            String shortestString = arr[0];
            String mostrepeatString = arr[0];
            for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                String k = entry.getKey();
                int f = entry.getValue();
                System.out.println(k + " : " + f);
                if (f > mostrepeatingfreq) {
                    mostrepeatingfreq = f;
                    mostrepeatString = k;
                }
                if (k.length() < shortestString.length()) {
                    shortestString = k;
                }
            }
            System.out.println("Most repeating word : " + mostrepeatString);
            System.out.println("Shortest word : " + shortestString);
            // String[] arr = finalstr.split(" ");
            // String smallest = arr[0];
            // int lengthsmallest = arr[0].length();
            // for (String a : arr) {
            // if (a.length() < lengthsmallest) {
            // smallest = a;
            // }
            // }

            // System.out.println(smallest);
            // BufferedWriter writer = new BufferedWriter(new FileWriter(obj));
            // writer.write(content.toString());
            // writer.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
