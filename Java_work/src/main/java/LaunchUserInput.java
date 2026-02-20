import java.util.Scanner;

public class LaunchUserInput {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        float fnum = scan.nextFloat();
        double dnum = scan.nextDouble();

        System.out.println(num);
    }
}
