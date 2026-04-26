import java.util.PriorityQueue;

public class LaunchPQ {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue(); // min heap ds

        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
//        pq.add(null); execption
        System.out.println(pq);

        pq.offer(200);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
