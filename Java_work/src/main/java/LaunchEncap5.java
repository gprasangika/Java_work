import java.lang.reflect.Constructor;

class Student2 {
    private int age;
    private String name;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LaunchEncap5 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.setAge(25);
        s1.setName("John");

        Student2 s2 = new Student2();

        s2.setAge(30);
        s2.setName("James");
    }
}
