import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1 {
    static void main(String[] args) {


        ArrayList<String> courses = new ArrayList<>();

        courses.add("AI");
        courses.add("DevOps");
        courses.add("Python");
        courses.add("Java");

//        Collections.shuffle(courses);  // Collections class is a utility class for collection operations, similary to Arrays class for array operations

        Collections.sort(courses);

        System.out.println(Collections.frequency(courses, "Java"));

        System.out.println(courses);

    }
}
