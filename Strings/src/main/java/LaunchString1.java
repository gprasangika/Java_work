public class LaunchString1 {
    public static void main(String[] args) {

//        String str1 = "telusko";
//
//        String str2 = "Telusko";
//
//        System.out.println(str1 == str2); // comparing references. in String constant pool - can't keep duplicate values
//        System.out.println(str1.equals(str2)); // compare values. in Object class, equals() is comparing refs. in String class the method has been overriden to compare values
//        System.out.println(str1.equalsIgnoreCase(str2)); // compare values ignoring case

//        String str1 = new String("telusko");
//        String str2 = new String("telusko");
//
//
//        System.out.println(str1 == str2); // comparing references. 2 objects are created with 2 refs. a copy will be maintained in the constant pool without ref and will be garbage collected before JVM shutdown.

//        String str1 = "Telusko";
//
//        String str2 = new String("Telusko");
//
//        System.out.println(str1 == str2);
//
//        System.out.println(str1.equals(str2));


        String s1 = "SACHIN";
        String s2 = "SAURAV";

        System.out.println(s1.compareTo(s2)); // 0 - equals  otherwise - not equal
    }
}


// lang package classes can be used in code without importing the class

// String - immutable
// StringBuilder - mutable
// StringBuffer - mutable