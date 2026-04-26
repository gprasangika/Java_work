import java.util.ArrayList;

public class LaunchArrayList {
    static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(20); // duplicate value allowed
        al.add(30);
        al.add(null); // allowed
        al.add(1,40); // index based insertion

        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("Telusko");
        al2.add("Java");
        al2.add("DevOps");

        System.out.println(al2);

        al2.addAll(2, al);

        System.out.println(al2);



    }
}

// added to rear