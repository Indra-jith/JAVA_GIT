import java.io.*;
import java.util.*;

public class fh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        try {
            File file = new File(fname);
            // StringBuilder content = new StringBuilder();
            ArrayList<Integer> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            // while ((line = reader.readLine()) != null) {
            // int val = Integer.parseInt(line);
            // list.add(val);
            // }
            // System.out.println(list);

            line = reader.readLine();
            String arr[] = line.split(",");
            for (String i : arr) {
                list.add(Integer.parseInt(i));
            }
            double sum = 0;
            double avg = 0;
            for (int i : list) {
                sum += i;
            }
            avg = sum / (list.size());
            System.out.println("sum = " + sum);
            System.out.println("avg = " + avg);
            reader.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
