import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;


class PersonalInfo {

    int age;
    String name;
    String city;

    public PersonalInfo() {
    }

    public PersonalInfo(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class LaunchMap {
    static void main(String[] args) {

        // key value pair // key and value can be any data type
//        HashMap hm = new HashMap(); // doesn't maintain order of insertion
//
//        hm.put(4, "Java");
//        hm.put("Lang1", "Python");
//        hm.put(6, "C++");
//        hm.put(7, "C");
//        hm.put(8, "C#");
//        hm.put(9.5, "JavaScript");
//        hm.put(new PersonalInfo(), "Rust");
//        System.out.println(hm);

//        HashMap<Integer, String> hm = new HashMap<>();
//        hm.put(43, "Java");
//        hm.put(44, null);   // null value allowed
//        hm.put(45, "C++");
//        hm.put(46, "Python");   // duplicate values allowed
//        hm.put(47, "C#");
//        hm.put(45, "JavaScript"); // duplicate keys not allowed, else will replace the old value
//        hm.put(null, "Rust"); // null key allowed
//
//        System.out.println(hm);

//        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>(); // maintains insertion order
//        hm.put(43, "Java");
//        hm.put(44, null);   // null value allowed
//        hm.put(45, "C++");
//        hm.put(46, "Python");   // duplicate values allowed
//        hm.put(47, "C#");
//        hm.put(45, "JavaScript"); // duplicate keys not allowed, else will replace the old value
//        hm.put(null, "Rust"); // null key allowed
//
//        System.out.println(hm);

//        HashMap<Integer, PersonalInfo> info = new HashMap<>();
//
//        info.put(43, new PersonalInfo(43, "Jamesh", "Pune"));
//        info.put(44, new PersonalInfo(44, "Sachin", "Bangalore"));
//        info.put(45, new PersonalInfo(45, "Virat", "Mumbai"));
//
//        System.out.println(info);

//        TreeMap tm = new TreeMap();     // sorts based on key // key can't be null // value can be null
//
//        tm.put(43, "Java");
//        tm.put(44, "C++");
//        tm.put(45, "Python");
//        tm.put(46, "C#");
//        tm.put(42, "JavaScript");
//        tm.put(48, "Rust");
//
//        System.out.println(tm);

        Hashtable ht = new Hashtable();     // doesn't maintain insertion order // key can't be null // value can't be null

        ht.put(43, "Java");
        ht.put(44, "C++");
        ht.put(45, "Python");
        ht.put(46, "C#");
        ht.put(42, "JavaScript");
        ht.put(48, "Rust");

        System.out.println(ht);

    }
}




// Map is a separate hierarchy. Does not come under Collection