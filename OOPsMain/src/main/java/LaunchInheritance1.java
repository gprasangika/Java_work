class Telusko {
    void course() {

        System.out.println("visit telusko.com");
    }
}



// parent/base/super class
class Alpha extends Telusko {

    int age;

    private String name;

    void disp() {
        System.out.println("This is Live Java SpringBoot classes");
    }

}

// child/derived/sub class
class Beta extends Alpha {

    void show() {
        age = 20;
//        name = "Telusko";
        System.out.println(age);
    }

}





public class LaunchInheritance1 {
    static void main(String[] args) {
        Beta b = new Beta();

        b.disp();
        b.show();
        b.course();
        System.out.println(b.toString());
    }
}
