import java.util.*;

public class matches {
    public static void main(String[] args) {
        // StringBuilder content = new StringBuilder();
        // content.append("hello how are you?");
        // content.replace(14, 14 + 4, "all");
        // int ind = content.indexOf("all");
        // System.out.println(ind);
        // String finalstr = content.toString();
        // System.out.println(finalstr);
        String pattern = "[a-zA-Z0-9]+";
        String str = "hello007.";
        System.out.println(str.matches(pattern));
    }
}