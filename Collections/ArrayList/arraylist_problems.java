import java.util.ArrayList;

public class arraylist_problems {
    public static void main(String[] args) {
        // swapping 2 elements
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        // swapping first and second
        int i1 = 0;
        int i2 = 1;
        String temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
        System.out.println("After swapping : " + list);
    }
}
