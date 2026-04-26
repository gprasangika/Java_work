import java.util.ArrayDeque;

class Telusko {


}


public class LaunchArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque(); // Double Ended Queue. Can be added to front and back.
        ad.add(100);
        ad.add(200);

        System.out.println(ad);

        ad.add(300);
        System.out.println(ad);

        ad.addFirst(400);
        System.out.println(ad);

        System.out.println(ad.peek());

        ad.add("Telusko");
        ad.add(45.5);
        ad.add(4);
        System.out.println(ad);

        ad.add(new Telusko());
//        ad.add(null); execption
        System.out.println(ad);
    }
}
// not recommended to store multiple sata types in a collection