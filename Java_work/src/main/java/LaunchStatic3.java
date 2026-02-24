import java.util.Scanner;

class Farmer {
    private float amount;
    private float si;
    private float tenure;

    private static float roi;

    static
    {
        roi = 4.5f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter loan amount required:");
        amount = sc.nextFloat();

        System.out.println("Kindly enter the time needed:");
        tenure = sc.nextFloat();
    }

    void compute() {
        si = (amount * tenure * roi) / 100.0f;
    }

    void display() {
        System.out.println("Simple Interest: " + si);
    }

    static void show() {
        System.out.println("Loan application logged out");
    }
}





public class LaunchStatic3 {
    static void main(String[] args) {
        System.out.println("Farmer Loan Application");

        Farmer f1 = new Farmer();
        System.out.println("Farmer 1 kindly fill form:");
        f1.input();
        f1.compute();
        f1.display();

        Farmer f2 = new Farmer();
        System.out.println("Farmer 2 kindly fill form:");
        f2.input();
        f2.compute();
        f2.display();

        Farmer f3 = new Farmer();
        System.out.println("Farmer 3 kindly fill form:");
        f3.input();
        f3.compute();
        f3.display();

        Farmer.show();

    }
}
