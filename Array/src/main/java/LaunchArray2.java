import java.lang.reflect.Array;
import java.util.Scanner;

public class LaunchArray2 {
    public static void main(String[] args) {

        // 2D regular Array
//        int [][]marks= new int[3][4];

        // 2D Jagged/irregular Array
//        int [][] marks = new int[3][];
//
//        marks[0] = new int[4];
//        marks[1] = new int[2];
//        marks[2] = new int[3];


        int [][][] marks = new int[2][2][3];

//        marks[0] = new int[2][3];
//        marks[1] = new int[3][3];
;
        Scanner sc = new Scanner(System.in);

//        for (int i=0; i<marks.length; i++){
//            for (int x=0; x<marks[i].length; x++){
//                System.out.println("Enter Marks of Student " + (x+1) + " in class " + (i+1));
//                marks[i][x] = sc.nextInt();
//            }
//        }
//
//        sc.close();
//
//        System.out.println("Marks of Students in each class are:");
//
//        for (int i=0; i<marks.length; i++){
//            System.out.print("Marks of students in class " + (i+1) + " are ");
//            for (int x=0; x<marks[i].length; x++){
//                System.out.print(marks[i][x] + " ");
//            }
//            System.out.println();
//        }


        for (int i=0; i<marks.length; i++){
            for (int x=0; x<marks[i].length; x++){
                for (int y=0; y<marks[i][x].length; y++){
                    System.out.println("Enter Marks of Student " + (y+1) + " in class " + (x+1) + " of school " + (i+1));
                    marks[i][x][y] = sc.nextInt();
                }

            }
        }


        sc.close();
        System.out.println("Marks of Students in each class are:");

        for (int i=0; i<marks.length; i++){
            System.out.println("Marks of students in school " + (i+1));
            for (int x=0; x<marks[i].length; x++){
                System.out.println("Class " + (x+1) + " ");
                for (int y=0; y<marks[i][x].length; y++) {
                    System.out.print(marks[i][x][y] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
