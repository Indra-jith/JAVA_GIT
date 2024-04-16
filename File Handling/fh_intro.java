import java.io.File;
import java.io.IOException;

public class fh_intro {
    public static void main(String[] args) {
        try {
            File file = new File("MyFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exist");
            }
            System.out.println(file.getName());
        } catch (IOException e) {
            System.out.println("Unexpected exception occured");
        }
    }
}