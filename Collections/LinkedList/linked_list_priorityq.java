import java.util.PriorityQueue;

public class linked_list_priorityq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(8);
        pq1.add(4);
        pq1.add(2);
        System.out.println("Before : " + pq1);
        System.out.println("Peek : " + pq1.peek());
    }
}

// Unlike normal queues, priority queue are retreived in a sorted order