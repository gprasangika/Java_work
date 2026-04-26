import java.util.Scanner;

class InvalidAgeExeption extends Exception {

    public InvalidAgeExeption(String message) {
        super(message);
    }
}

class Applicant {

    private int age;

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        age = sc.nextInt();
        sc.close();
    }

    public void verify() throws InvalidAgeExeption {
        if (age >= 18 && age <= 70) {
            System.out.println("Allowed to apply");
        }
        else {
            throw new InvalidAgeExeption("Age must be 18 or above and below 70");
        }
    }
}

class RTO {


    public void initiate() {
        Applicant a = new Applicant();
        try {
            a.input();
            a.verify();
        }
        catch (InvalidAgeExeption e) {
            System.out.println(e.getMessage());   // this accesses private member of the class Throwable. as getMessage() is not overridden, so calls getMessage() where bytecode is in Throwable class, it accesses the defaultMessage private variable in Throwable class
        }

    }
}







public class LaunchCustom2 {

    public static void main(String[] args) {
        RTO r = new RTO();
        r.initiate();
    }
}
