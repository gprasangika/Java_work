import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections {
    static void main(String[] args) {

        // type safety
        int []ar = new int[3];

        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;

        int data = ar[1];

        System.out.println(data);


        // type safety
        String str[] = new String[2];

        str[0] = "AI";
        str[1] = "DevOps";

        String info = str[0];

        System.out.println(info);


        ArrayList<String> courses = new ArrayList<>();

        courses.add("AI");
        courses.add("DevOps");
        courses.add("Java");
        courses.add("Python");
//        courses.add(10);

//        String c = (String) courses.get(3);
        String c = courses.get(3);

        System.out.println(c.toUpperCase());


        // Generic should be object type, not primitive type. Can use any class as generic
        ArrayList<Integer> list = new ArrayList<>();

        list.add(44);
        list.add(55);
        list.add(66);

        System.out.println(list);

    }
}
