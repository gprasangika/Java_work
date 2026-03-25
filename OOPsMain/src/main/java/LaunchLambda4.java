interface ICourse {

    String course(String name);


}




public class LaunchLambda4 {
    static void main(String[] args) {


        course(cName -> "The duration of " + cName + " is 5 months");

    }


    public static void course(ICourse fi) {


        System.out.println(fi.course("Java"));

    }
}


//(1) implementation using a class
//(2) implementation using anonymous class
//(3) implementation using lambda expression as ref of interface and calling implemented method through ref
//(4) implementation using lambda expression - pass in implementation as ref to a method and calling implemented method through implementation ref
//(5) implementation using lambda expression - pass in implementation directly to a method and calling implemented method through interface ref