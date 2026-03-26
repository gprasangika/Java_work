class Calc {


    public int add(int ...a) { //int ar[]={10, 5, 4}
        int sum = 0;
        for(int ai: a){
            sum = sum + ai;
        }


        return sum;
    }

}


public class LaunchVarArgs {
    public static void main(String[] args) {

        Calc c = new Calc();
        System.out.println(c.add(10,5,4));
    }



}
