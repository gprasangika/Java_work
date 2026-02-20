class Calc {
//    int n1, n2, res;
    int res;

//    void multiply(){
//        n1 = 5;
//        n2 = 5;
//        res = n1*n2;
//        System.out.println("Result is " + res);
//    }

//    int multiply(){
//        n1 = 5;
//        n2 = 5;
//        res = n1*n2;
//        return res;
//    }

//    void multiply(int x, int y){
//        res = x*y;
//        System.out.println("Result is " + res);
//    }

    int multiply(int x, int y){
        res = x*y;
        return res;
    }
}


public class LaunchMethods {
    public static void main(String[] args) {
        Calc c = new Calc();
        int result =  c.multiply(5,5);
        System.out.println("Result is " + result);
    }
}
