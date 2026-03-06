class Telusko1 {

    int age=10;

//    void disp() {
////        age = 4;
////        System.out.println(age);
//        System.out.println("disp of parent");
//    }
}

class Alien extends Telusko1 {

    int age = 11;
//    void disp() {
////        age = 6;
////        System.out.println(age);
//        System.out.println("disp of child overridden");
//    }

    void show() {
        System.out.println(age);
        System.out.println(super.age);
    }
}




public class LaunchSuper {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.show();
    }
}
