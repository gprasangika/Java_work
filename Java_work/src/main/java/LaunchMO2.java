class Calc3 {

//    double add(double n1, double n2){
//        return n1+n2;
//    }

    int add(int n1, int n2){
        return n1+n2;
    }


    double add(int n1, double n2){
        return n1+n2;
    }

    double add(double n1, int n2){
        return n1+n2;
    }
}




public class LaunchMO2 {
    public static void main(String[] args) {
        Calc3 c = new Calc3();

        System.out.println(c.add(10,20));
    }
}
