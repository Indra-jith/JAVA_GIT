import java.io.File;

public class fh_deleting {
    public static void main(String[] args) {
        File file = new File("MyFile");
        if (file.delete()) {
            System.out.println("File deleted successfuly");
        } else {
            System.out.println("File does not exist to be deleted");
        }
    }
}
