interface FI2 {



    float add(int a, float b);
}



public class LaunchLambda3 {
    static void main(String[] args) {


//        FI2 f1 = (a, b) -> a + b;
//
//        System.out.println(f1.add(10,20));

//        show(f1);

        show((a, b) -> a + b);
    }

    public static void show(FI2 fi) {
        System.out.println(fi.add(10,20));
    }
}
