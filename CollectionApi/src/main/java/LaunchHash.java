import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHash {
    static void main(String[] args) {
//        HashSet hs = new HashSet(); // hashing algorithm
//
//        hs.add(100);
//        hs.add(200);
//        hs.add(300);
//        hs.add(400);
//        hs.add(500);
//        hs.add(500); // duplicates not allowed
//        hs.add(null); // allowed
//        System.out.println(hs);

        LinkedHashSet hs = new LinkedHashSet(); // hashing algorithm // maintains insertion order

        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        hs.add(500); // duplicates not allowed
        hs.add(null); // allowed
        System.out.println(hs);
    }
}
