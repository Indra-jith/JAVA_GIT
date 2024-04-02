import java.util.ArrayList;
import java.util.Arrays;

public class arraylist_2 {
    public static void main(String[] args) {

        // converting ArrayList into Array
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mercury");
        list1.add("Venus");
        list1.add("Earth");
        list1.add("Mars");

        String arr1[] = new String[list1.size()];

        // conversion from arraylist to array
        // --------------------
        list1.toArray(arr1);
        // --------------------

        // converting from ArrayList to String
        // ------------------------
        System.out.println("ArrayList to string : " + list1.toString());
        // ------------------------
        for (String str : arr1) {
            System.out.println(str);
        }

        // Converting Array into an ArrayList
        String arr2[] = { "Mercury", "Venus", "Earth" };
        // -------------------------------------------------------------
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        // -------------------------------------------------------------

        System.out.println(list2);
    }
}
