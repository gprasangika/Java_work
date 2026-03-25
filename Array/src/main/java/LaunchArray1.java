import java.util.Scanner;

public class LaunchArray1 {
    public static void main(String[] args) {
        int [] marks = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<marks.length ; i++)
        {
            System.out.println("Enter Marks of Student " + (i+1));
            marks[i] = sc.nextInt();
        }

        sc.close();

        for (int i=0; i<marks.length; i++){
            System.out.println("Marks of student " + (i+1) + " is " + marks[i]);
        }

    }
}
