public class LaunchConditional {
    public static void main(String[] args) {
//        int age = 19;

//        if (age>18)
//            if (age>=20)
//                System.out.println("You are in twenties");
//            else
//                System.out.println("You are 19, but still a teenager");
//        else if (age == 18)
//            System.out.println("You are 18");
//        else
//            System.out.println("You are younger than 18");

//        int number = 4;
//        String result = (number % 2 == 0)? "Even" : "Odd";
//
//        System.out.println(result);

        int n1 = 5;
        int n2 = 10;
        int n3 = 15;

        int maxNum = (n1>n2)? (n1>n3)? n1 : n3 : (n2>n3)? n2 : n3;

        System.out.println(maxNum);
    }
}
