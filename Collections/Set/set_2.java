import java.util.HashSet;
import java.util.Iterator;

public class set_2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet();
        set1.add(2);
        set1.add(4);
        set1.add(5);

        Iterator<Integer> itr = set1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        HashSet<Integer> set2 = new HashSet();

        set2.add(5);
        set2.add(6);
        set2.add(7);

        // set1.retainAll(set2); // removes uncommon elements
        // System.out.println(set1); // prints common elements

        set1.removeAll(set2); // removes common
        System.out.println(set1);

    }
}

/*
 * Java HashSet: Ideal when order is unimportant, uniqueness is required, and
 * potential null values need to be handled.
 */