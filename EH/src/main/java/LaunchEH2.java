import java.util.Scanner;

public class LaunchEH2 {
    public static void main(String[] args) {
        System.out.println("Calc app started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter numerator to divide");

        int numerator = sc.nextInt();

        System.out.println("Kindly enter denominator to divide");
        int denominator = sc.nextInt();

        sc.close();

        // need to have both try and catch blocks
        // exception outside the try block won't be handled by catch block
        // in which line inside try block the exceptions occurs, lines after that line in try block won't be executed
        try {
            System.out.println("Result is " + numerator/denominator);

        } catch (Exception e) {
            System.out.println("Enter non zero denominator");
        }
        System.out.println("Calc app terminated");
    }
}
