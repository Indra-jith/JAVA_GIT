import java.io.*;

public class avgmarks {
    public static void main(String[] args) {
        try {
            File file = new File("marks.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            line = reader.readLine();
            String[] linestr = line.split(" ");
            int[] intarr = new int[linestr.length];
            for (int i = 0; i < linestr.length; i++) {
                intarr[i] = Integer.parseInt(linestr[i]);
            }
            int sum = 0;
            for (int i : intarr) {
                sum += i;
            }
            System.out.println(sum / (linestr.length));
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
