import java.util.PriorityQueue;

public class Zad9 {

    public static <T> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
        PriorityQueue<T> result = new PriorityQueue<>(queue1);
        result.addAll(queue2);
        return result;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(5);

        PriorityQueue<Integer> q2 = new PriorityQueue<>();
        q2.add(20);
        q2.add(1);

        PriorityQueue<Integer> merged = mergePriorityQueues(q1, q2);
        while (!merged.isEmpty()) {
            System.out.println(merged.poll());
        }
    }
}