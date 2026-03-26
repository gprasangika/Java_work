public class Launchstring3 {
    public static void main(String[] args) {

//        String str1 = "alien";
//        System.out.println(str1);
//        str1 = "telusko";   // not changing the "alien" object. creates a new object and str1 refers to that new object. as the object is not changeable, it is immutable
//
//        System.out.println(str1);

        String s1 = "alien";
        String s2 = " telusko";

        String s3 = " java";

        String s4 = s1.concat(s2);  // object will be created in heap. not SCP. only direct literals will be stored in SCP. concat() used to concat 2 strings

        String s5 = "alien telusko"; //SCP

        System.out.println(s4 == s5);

        String s6 = s1 + s2 + s3 + " devops";       // to concat more than 2 strings

        System.out.println(s6);

        String str1 = 10 + 2 + "java";

        String str2 = "Java" + 10 + 2;

        System.out.println(str1);
        System.out.println(str2);

        String str3 = 10 + "Java" + 2;
        System.out.println(str3);


        System.out.println(s1.concat(s2).concat(s3));

        System.out.println(s1+s2+s3);

    }
}
