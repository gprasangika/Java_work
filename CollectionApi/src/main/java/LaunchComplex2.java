import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1> {

    int age;
    String name;
    double avg;

    public Cricketer1(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    public int compareTo(Cricketer1 o) {
        if(this.avg > o.avg) {
            return 1;
        }
        return -1;
    }

}

//class Alpha implements Comparable<Cricketer1> {
//
//    // -1 means no swap, 1 means swap - required for sorting algorithm
//    public int compareTo(Cricketer1 o1, Cricketer1 o2) {
//
//
//        if(o1.avg > o2.avg) {
//            return 1;
//        }
//        return -1;
//    }
//}






public class LaunchComplex2 {
    static void main(String[] args) {

        ArrayList<Cricketer1> list = new ArrayList<>();

        list.add(new Cricketer1(34, "Rahul", 90.5));
        list.add(new Cricketer1(33, "Virat", 85.2));
        list.add(new Cricketer1(35, "Sachin", 92.1));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}

// Comparable interface implementation is done in target class. Comparator interface implementation is done outside target class.
