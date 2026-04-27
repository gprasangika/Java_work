import org.w3c.dom.Node;

import java.security.KeyStore;
import java.util.*;

interface Alpha2 {

    interface Gamma {                       // inner interface
        static void gamma() {
            System.out.println("static method of gamma");
        }
    }
}






public class LaunchMap2 {
    static void main(String[] args) {
//        Alpha2.Gamma.gamma();

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(3, "C++");
        hm.put(4, "C");
        hm.put(5, "C#");
        hm.put(6, "JavaScript");
        hm.put(7, "Rust");
        hm.put(8, "Go");
        hm.put(9, "Swift");
        hm.put(10, "Kotlin");
        hm.put(11, "Dart");

        System.out.println(hm);

        System.out.println(hm.get(1));
        System.out.println(hm.keySet());

        Set<Integer> keySet = hm.keySet();

        Iterator<Integer> itr = keySet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(hm.values());

        Collection<String> valueSet = hm.values();
        Iterator<String> itr2 = valueSet.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println(hm.entrySet());

        Set set = hm.entrySet();

        Iterator itr3 = set.iterator();

        while (itr3.hasNext()) {

//         System.out.println(itr3.next().getClass());
//            System.out.println(itr3.next());
            Map.Entry entry = (Map.Entry) itr3.next(); // casting Object to Map.Entry // not downcasting
            System.out. println(entry.getKey() + " " + entry.getValue());
        }

//        AbstractMap.SimpleEntry
//
//        Node
    }
}
