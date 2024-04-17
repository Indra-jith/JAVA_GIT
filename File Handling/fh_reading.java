import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fh_reading {
    public static void main(String[] args) {
        try {
            File file = new File("Reading.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
