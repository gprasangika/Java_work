// in an interface, all the methods are public and abstract by default
// an interface can extend another interface
// an interface cannot implement another interface

interface Calculator {

    void sub(int a, int b);

}

interface C {

}


interface Calc extends C, Calculator{

    float pi = 3.14f;           // public final static

    void add(int a, int b);

    int mul(int a, int b);

}


// a class can implement multiple interfaces
class MyCalc implements Calc, Calculator {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("addition output is "+c);
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public void sub(int a, int b) {
        System.out.println("subtraction output is "+(a-b));
    }

}

class TeluskoLearning {


}

// can extend and implement together. first extend then implement
class MyCalc2 extends TeluskoLearning implements Calc {

    public void add(int a, int b) {
        int c = a + b + 100;
        System.out.println("addition output is "+c);
    }

    public int mul(int a, int b) {
        return a*b*100;
    }

    public void sub(int a, int b) {
        System.out.println("subtraction output is "+(a-b-100));
    }
}


public class LaunchInterface {
    static void main(String[] args) {

        Calc c1 = new MyCalc();
        Calc c2 = new MyCalc2();

        c1.add(10,20);
        c2.add(10,20);
        System.out.println(c1.mul(10,20));
        System.out.println(c2.mul(10,20));
    }
}
