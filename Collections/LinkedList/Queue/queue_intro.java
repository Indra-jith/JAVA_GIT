import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class queue_intro {
    public static void main(String[] args) {
        Queue<String> ll1 = new LinkedList<>();
        ll1.add("Mercury");
        ll1.add("Venus");
        ll1.add("Earth");
        ll1.add("Mars");
        System.out.println(ll1.peek()); // retreives head
        System.out.println(ll1.poll()); // retreives and removes head
        ll1.offer("Jupiter");
        System.out.println(ll1);

        Deque<String> ll2 = new LinkedList<>();
        ll2.add("Mercury");
        ll2.add("Venus");
        ll2.add("Earth");
        ll2.add("Mars");
        ll2.addFirst("Jupiter");
        ll2.addLast("pluto");
        System.out.println(ll2);
    }
}
