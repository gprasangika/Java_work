import java.util.Scanner;

class Alpha {


    // better to duck to inform other developers that this method can throw exception
    public void divide() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Alpha application started");

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
            throw e;
        }
        finally {
            System.out.println("Alpha application terminated");
            sc.close();
        }// statements after throw won't execute. to execute, need to keep them in finally block.
        // finally will execute
            // even if there is an exception and handled
            // even if there is an exception and not handled
            // even if there is no exception
        // critical code should be in finally block
    }
}

//class Alpha2 {
//
//    public void disp() {
//
//        try {
//            Alpha d = new Alpha();
//            d.divide();
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Enter non zero denominator 1");
//        }
//
//
//    }
//}

public class LaunchEH6 {
    public static void main(String[] args) {
        System.out.println("Main app started");

        try {
            Alpha d2 = new Alpha();
            d2.divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Enter non zero denominator 2");
        }

        System.out.println("Main app terminated");
    }
}

