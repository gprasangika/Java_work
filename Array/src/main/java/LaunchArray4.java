public class LaunchArray4 {
    public static void main(String[] args) {

//        int []arr =  {2, 6, 5};
//
//        int [][]mul = {{2, 6},{6, 7}};
//
//        int [][]mul2 = {{2, 6, 5},{6, 7}};

//        int []data = {2,5,6,7,8};

//        for(int i=0; i<data.length; i++){
//          System.out.println(data[i]);
//        }

        // enhanced loop or for each loop
//        for(int item:data)
//        {
//            System.out.println(item);
//        }

        int [][]arr = {{2, 6, 5},{6, 7, 8}};

        for (int item[]:arr) {
            for (int x:item) {
                System.out.print(x + " ");
            }
            System.out.println();
        }




//        data.forEach(item -> System.out.println(item));
    }
}
