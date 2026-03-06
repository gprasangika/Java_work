class Demo1 {

    int a, b;
    Demo1() {
        System.out.println("Demo1 zero param constructor");
    }

    Demo1(int a, int b) {
        this.a= a;
        this.b= b;

        System.out.println("Demo1 param constructor");
    }


}

class Demo2 extends Demo1 {

    int x, y;
    Demo2() {
        System.out.println("Demo2 zero param constructor");
    }

    Demo2(int x, int y) {
        this();
//        super(5, 5);
        this.x= x;
        this.y= y;
        System.out.println("Demo2 param constructor");


    }

    void disp() {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }


}




// parent class constructor will be called in any constructor on top of the lines
public class LaunchInheritance3 {
    static void main(String[] args) {
        Demo2 d2 = new Demo2(4, 5);

        d2.disp();
    }
}
