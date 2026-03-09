class Telusko2 {

    final float pi = 3.14f;

    public void courses() {
//        pi = 11;
        System.out.println("Telusko has both live and recorded courses");
    }



}

class TeluskoTux extends Telusko2 {

    public void courses() {

        System.out.println("Telusko ai is also getting launched");
    }

}






public class LaunchFinal {
    public static void main(String[] args) {
        TeluskoTux t = new TeluskoTux();
        t.courses();
    }
}


//(1) final class we can't inherit from
//        (2) final methods can be inheritted, but can't override
//        (3) final variable can only be initialized once. acts as constant. final variables are usually static as the value is not changed and will be same for all objects.
