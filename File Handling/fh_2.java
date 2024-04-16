import java.io.FileWriter;
import java.io.IOException;

public class fh_2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("MyFile.txt");
            fw.write("Writing some demo text");
            fw.close();
            System.out.println("Closed successfuly");
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
