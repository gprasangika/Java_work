import java.util.Scanner;

public class LaunchEH3 {
    public static void main(String[] args) {
        System.out.println("app started");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Kindly enter numerator to divide");

            int numerator = sc.nextInt();

            System.out.println("Kindly enter denominator to divide");
            int denominator = sc.nextInt();

//        sc.close();

            // need to have both try and catch blocks
            // exception outside the try block won't be handled by catch block
            // in which line inside try block the exceptions occurs, lines after that line in try block won't be executed

            System.out.println("Result is " + numerator / denominator); //ArithmeticException

            System.out.println("Enter size of an array");

            int size = sc.nextInt();    //NegativeArraySizeException

            int[] ar = new int[size];

            System.out.println("Enter data to be inserted in array");

            int data = sc.nextInt();

            System.out.println("Enter the position at which data has to be inserted");

            int index = sc.nextInt();

            ar[index] = data; //ArrayIndexOutOfBoundsException

            sc.close();
        }
        catch (ArithmeticException e) {
            System.out.println("Kindly enter non zero denominator");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Stay positive");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Be within your limits! Don't cross boundaries");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }   // recommended to have a catch block for Exception to handle any other unexpected exceptions when there are multiple catch blocks handled. should be at the end. if placed on top, will give compile time error as then there is no need to keep other block as compiler identifies generic block can handle any exception.


        System.out.println("app terminated");
    }
}
