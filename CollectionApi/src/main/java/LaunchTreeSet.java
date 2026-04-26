import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchTreeSet {
    static void main(String[] args) {



        TreeSet<Integer> ts = new TreeSet<>(); // binary tree // red-black algorithm // ascending order

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
//        ts.add(175);   // duplicate value not allowed
//        ts.add(null); // exception

        System.out.println(ts);

        System.out.println(ts.higher(100)); // does not care if 100 exists or not. returns immediate higher value
        System.out.println(ts.lower(100)); // does not care if 100 exists or not. returns immediate lower value
        System.out.println(ts.ceiling(65)); // if 65 exists, then return 65. if not, return immediate higher value
        System.out.println(ts.floor(30)); // if 30 exists, then return 30. if not, return immediate lower value

        System.out.println(ts.ceiling(100));
        System.out.println(ts.floor(100));
        System.out.println(ts.headSet(100));
        System.out.println(ts.tailSet(100));

        CopyOnWriteArrayList al = new CopyOnWriteArrayList();

        al.addAll(ts);

        ListIterator litr = al.listIterator(3);

        while (litr.hasNext()) {
            System.out.println(litr.next());
            al.add("Linux");
        }

    }
}
