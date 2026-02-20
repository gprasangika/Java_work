class CalcD {

    int add(int n1, int n2){
        return n1+n2;
    }

    float add(float n1, int n2){
        return n1+n2;
    }

    float add(float n1, float n2){
        return n1+n2;
    }

    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }



}

public class LaunchMO {
    static void main(String[] args) {
        CalcD c = new CalcD();

        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1.5f,2));
        System.out.println(c.add(2.5f, 2.5f));
    }
}