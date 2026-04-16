import java.util.Scanner;

class Demo {


    public void divide() {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Kindly enter numerator to divide");

            int numerator = sc.nextInt();

            System.out.println("Kindly enter denominator to divide");
            int denominator = sc.nextInt();



            // need to have both try and catch blocks
            // exception outside the try block won't be handled by catch block
            // in which line inside try block the exceptions occurs, lines after that line in try block won't be executed

            System.out.println("Result is " + numerator/denominator);
        }
        catch (ArithmeticException e) {
            System.out.println("Enter non zero denominator");
        }

        sc.close();
    }
}

class Demo2 {

    public void disp() {

        try {
            Demo d = new Demo();
            d.divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Enter non zero denominator 1");
        }


    }
}

public class LaunchEH5 {
    public static void main(String[] args) {
        System.out.println("Calc app started");
        try {
            Demo2 d2 = new Demo2();
            d2.disp();
        }
        catch (ArithmeticException e) {
            System.out.println("Enter non zero denominator 2");
        }

        System.out.println("Calc app terminated");
    }
}
