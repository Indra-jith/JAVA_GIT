import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet();
        // Additional methods are there in this apart from hashset

        set1.add(3);
        set1.add(2);
        set1.add(8);
        System.out.println(set1); // ordered order [2,3,8]

        TreeSet<Integer> set2 = new TreeSet();
        set2.add(5);
        set1.addAll(set2);
        System.out.println(set1);
    }
}
// Hashset implements Set interface
// no order in this

// Treeset implements Set interface and SortedSet interface
// sorted order (ASC by default)