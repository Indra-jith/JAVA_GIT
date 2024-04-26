import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

import javax.annotation.processing.FilerException;

public class fh_sh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        File obj = new File(fname);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(obj));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            StringBuilder content = new StringBuilder();
            content.
            content.append(line);
            conent.append(0,line);
            int index = content.indexOf("mum")
            content.replace(index,index+length_old_word,new_word);
            String newc = content.toString()
            BufferedWriter writer = new BufferedWriter(new FileWriter(obj, true));
            System.out.println("Enter content to be written: ");
            String content = scanner.nextLine();
            writer.write(content);
            writer.close();

        } catch (IOException e) {
            System.out.println("file not found blah");
        }

    }
}
