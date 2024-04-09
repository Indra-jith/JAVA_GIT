import java.util.TreeSet;

public int goe(TreeSet<Integer> set1, int element) {
    return set1.ceiling(element);
}

public class treeset_2 {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet();
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(9);
        set1.add(12);

        // System.out.println(set1.ceiling(7)); // >=
        // System.out.println(set1.floor(8)); // <=

        // System.out.println("Removed : " + set1.pollLast());
        // System.out.println(set1);

        // System.out.println(set1.headSet(5, true)); // all elements <=5
        // System.out.println(set1.headSet(5, false)); // all elements <5
        // System.out.println(set1.tailSet(5, true)); // all elements >=5
        // System.out.println(set1.tailSet(5, false)); // all elements >5

        // System.out.println(set1.subSet(3, true, 9, true)); // 3<=x<=9
        // System.out.println(set1.subSet(3, false, 9, false)); // 3<x<9

        TreeSet<Integer> set2 = new TreeSet();
        set2.add(1);
        set2.add(5);
        set2.add(8);
        set2.add(10);
        set2.add(22);

        // union and intersection is also possible

        // write a java program to get the element in a treeset strictly greater than or
        // equal to given element
    }
}
