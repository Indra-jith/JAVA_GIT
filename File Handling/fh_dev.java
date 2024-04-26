import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class fh_dev {
    public static void main(String[] args) {
        try {
            File obj = new File("bablu.txt");
            BufferedReader reader = new BufferedReader(new FileReader(obj));
            String line;
            StringBuilder content = new StringBuilder();
            StringBuilder linerev = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                linerev.append(line);
                linerev.reverse();
                content.append(linerev + "\n");
                linerev.setLength(0);
                System.out.println(line);
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(obj));
            writer.write(content.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
