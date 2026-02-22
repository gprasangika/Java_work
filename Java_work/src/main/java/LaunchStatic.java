class Demo {
    static int a, b; //1

    int x, y;

    static {    //2
        System.out.println("Static init block");
    }

    {
        System.out.println("Java Init block (non static)");
    }

    Demo() {
        System.out.println("Constructor");
    }

    static void disp() {
        System.out.println("disp static method");
    }

    void show() {
        System.out.println("non static show method");
    }

}



public class LaunchStatic {
    static {
        System.out.println("Static block main");
    }
    static void main(String[] args) {
        System.out.println("main method");

        Demo d1 = new Demo();
    }
}
