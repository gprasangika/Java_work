//class A {
//
//
//    void disp() {
//
//        System.out.println("telusko.com");
//    }
//
//}
//
//// inheritance - class A and B are tightly coupled. eg: if class A changes to AA then Class B will give errors as A class is not there anymore.
//class B extends A{
//
//
//
//    void show() {
//        disp();
//        //composition
////        A a = new A();
////        a.disp();  // Class A and B are tightly coupled. eg: if class A changes to AA then Class B will give errors as A class is not there anymore.
//    }
//}


// to access the methods of one class from another class without using that class's name - loose coupling


public class LaunchLooseCoupling {

    public static void main(String[] args) {
        System.out.println("Launching Loose Coupling Example");
    }
}
