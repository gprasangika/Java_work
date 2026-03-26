public class LaunchWrapper {
    public static void main(String[] args) {

//        int --> Integer
//        char --> Character
//        double --> Double
//        boolean --> Boolean

//        Integer i = new Integer(10); // deprecated
        Integer i2 = Integer.valueOf(10); // recommended // Boxing int --> Integer

        int age = 16;

        Integer a = age; // primitive --> Integer Object --> AutoBoxing

        System.out.println(a);

        int retInt = i2.intValue(); // Unboxing

        System.out.println(retInt);

        int retVal = a; // AutoUnboxing

        System.out.println(retVal);

        // Boxing --> AutoBoxing
        // Unboxing --> AutoUnboxing



    }
}
