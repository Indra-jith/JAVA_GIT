import java.util.LinkedList;

public class linked_list_intro {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");
        // Not in a contiguous memory, connected by links
        // They are scattered and connected by prev and next links
        // It is a doubly linked list
        // null <- the first one's prev
        // the last one's next -> null

        System.out.println("Orig linked list : " + ll1);

        /*
         * ll1.get(1);
         * ll1.set(1,"test");
         * ll1.remove(1);
         * etc....
         * same like ArrayList
         * then WHAT IS DIFFERENT?
         */
    }

}
