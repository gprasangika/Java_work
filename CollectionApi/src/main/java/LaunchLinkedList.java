import java.util.LinkedList;

public class LaunchLinkedList {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);
        ll.add(500); // duplicate value allowed

        ll.add(null); // allowed
        ll.add(2, 44);

        System.out.println(ll);
    }
}
