import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Cricketer {

    int age;
    String name;
    double avg;

    public Cricketer(int age, String name, double avg) {
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
}

//class Alpha implements Comparator<Cricketer> {
//
//    // -1 means no swap, 1 means swap - required for sorting algorithm
//    public int compare(Cricketer o1, Cricketer o2) {
//
//
//        if(o1.avg > o2.avg) {
//            return 1;
//        }
//        return -1;
//    }
//}




public class LaunchComplex1 {
    static void main(String[] args) {

        ArrayList<Cricketer> list = new ArrayList<>();

        list.add(new Cricketer(34, "Rahul", 90.5));
        list.add(new Cricketer(33, "Virat", 85.2));
        list.add(new Cricketer(35, "Sachin", 92.1));


        //Comparator //Comparable interfaces
        // need to implement Comparator interface or Comparable interface when sorting complex data types
        // Comparator - when target class(Cricketer) is not editable may be due to no permission to edit the class

        System.out.println(list);
//        Alpha a = new Alpha();
//        Collections.sort(list, a);
//        System.out.println(list);

        // behind the scene, it will call compare method of Alpha class

//        Comparator<Cricketer> cm = new Comparator<Cricketer>() {
//            public int compare(Cricketer o1, Cricketer o2) {
//                if (o1.age > o2.age) {
//                    return 1;
//                }
//                return -1;
//            }
//        };
//
//        Collections.sort(list, cm);
//        System.out.println(list);

//        Comparator<Cricketer> cm = (Cricketer o1, Cricketer o2) -> {if(o1.avg > o2.avg) {
//            return 1;
//        }
//        return -1;};
//
//        Collections.sort(list, (Cricketer o1, Cricketer o2) -> {if(o1.avg > o2.avg) {
//            return 1;
//        }
//            return -1;});
//
//        System.out.println(list);
    }
}
