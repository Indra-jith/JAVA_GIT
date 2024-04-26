import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fh_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        try {
            File file = new File(fname);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("your mum");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println(content);
            int index = content.indexOf("mum");
            if (index != -1) {
                content.replace(index, index + 3, "dad");
            }
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(file));
            writer1.write(content.toString());
            writer1.close();

        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}