import javax.naming.ConfigurationException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchAccessData {
    static void main(String[] args) {
//        ArrayList al = new ArrayList();
//
//        al.add("Telusko");
//        al.add("Java");
//        al.add("DevOps");
//        al.add("AWS");
//        al.add("Azure");
//
//        String telusko = (String) al.get(3);
//
//        System.out.println(telusko);

//        System.out.println(al.get(2));

//        for(int i=0; i<al.size(); i++) {
//            System.out.println(al.get(i));
//            al.add("Ai Engineering");
//        }                                 // no exception. infinite loop

//        for(Object c:al)
//        {
//            System.out.println(c);
//            al.add("Linux");
//        }                                 // throws concurrent modification exception

        // to access data in collection, iterator is recommended over for loop and enhanced for loop
//        Iterator itr = al.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            al.add("Linux"); // fail fast - not allowing concurrent modification with an exception
//        }

//        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//
//        al.add("Telusko");
//        al.add("Java");
//        al.add("DevOps");
//        al.add("AWS");
//        al.add("Azure");
//
//        String telusko = (String) al.get(3);
//
//        System.out.println(telusko);
//
//        Iterator itr = al.iterator(); // only forward iteration is allowed from the start
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            al.add("Linux"); // fail safe - allowing concurrent modification without an exception. iterator doesn't see newly added elements. to allow concurrent modification without exception, use CopyOnWriteXXXXXX collection class
//        }
//
//
////        ListIterator litr = al.listIterator(al.size());
//        ListIterator litr = al.listIterator(3);     // with List iteration, can control the iteration by setting the index. List iterator only available in ArrayList and LinkedList
//
//        // reverse of collection
////        while (litr.hasPrevious()) {
////            System.out.println(litr.previous());
////            al.add("Linux");
////        }
//
//        while (litr.hasNext()) {
//            System.out.println(litr.next());
//            al.add("Linux");
//        }


        Vector v = new Vector();

        v.add("Telusko");
        v.add("Java");
        v.addElement("DevOps");


        System.out.println(v);

        Iterator itr = v.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Enumeration en = v.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }


    }
}
