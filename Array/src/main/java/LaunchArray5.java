import java.util.Arrays;

public class LaunchArray5 {
    public static void main(String[] args) {
//        int []arr = new int[6];

//        float []arr = new float[6];

        double [][]arr = new double[6][6];


        System.out.println(arr.getClass().getName());

        int []a = {4, 4,32,4,4};


        for (int item:a) {
            System.out.print(item + " ");
        }


        System.out.println();
        Arrays.sort(a);

        for (int item:a) {
            System.out.print(item + " ");
        }

        System.out.println();

        System.out.println(Arrays.binarySearch(a, 4));

    }
}
