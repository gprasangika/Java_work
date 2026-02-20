class Student {
    int id;
    String name;
    double age;

    void sleep(){
        System.out.println("Student is sleeping");
    }

    void study(){
        System.out.println("Student is studying");
    }

    int calMarks(int sub1, int sub2) {
        int total = sub1+sub2;
        return total;
    }

}

public class LaunchOOP1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.sleep();
        student1.study();
        System.out.println(student1.calMarks(10,20));
    }
}
