import java.util.LinkedList;
import java.util.Queue;

public class Zad7 {
    public static <T> void reverseQueue(Queue<T> queue) {
        if(queue.isEmpty()) return;

        T element = queue.poll();
        reverseQueue(queue);
        queue.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Oryginalna kolejka: " + q);
        reverseQueue(q);
        System.out.println("Odwrócona kolejka: " + q);
    }
}
