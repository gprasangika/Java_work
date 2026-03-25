
@FunctionalInterface
interface Alien1 {


    void disp();    // single abstract method, then interface is called functional interface

}

class AlienImpl implements Alien1 {

    public void disp() {
        System.out.println("Alien is disp");
    }
}


public class LaunchLambda {
    static void main(String[] args) {
//        Alien1 a = new AlienImpl();
//        a.disp();


//        Alien1 al = new Alien1() {
//
//
//            public void disp() {
//                System.out.println("Lambda is disp");
//            }
//        };  // anonymous inner class. provides implementation on spot. implementing via class is more readable.
//
//        al.disp();


        Alien1 al = () -> System.out.println("Hello from lambda");      // lambda expression.

        al.disp();

        Alien1 al2 = () -> System.out.println("Hello from lambda 2");

        al2.disp();
    }
}
