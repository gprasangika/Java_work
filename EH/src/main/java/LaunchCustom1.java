import java.util.Scanner;

// extending Exception class needs to define throws for the method throwing the exception and handle exception in caller or propogate. Compiler checks.
// extending RuntimeException class does not need to define throws for the method throwing the exception and handle exception in caller or propogate. compiler does not check
class InvalidCustomerException extends Exception {


    public InvalidCustomerException(String message) {
        super(message);
    }
}

class ATM {

    private int acc_num = 1111;

    private int passwd = 2222;
    private int an;
    private int pw;

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        an = sc.nextInt();
        System.out.println("Enter password");
        pw = sc.nextInt();
    }

    public void verify() throws InvalidCustomerException{
        if (an ==acc_num && pw == passwd)
        {
            System.out.println("Collect your cash");
        }
        else {
//            System.out.println("Invalid credentials");

//            InvalidCustomerException e = new InvalidCustomerException();
            throw new InvalidCustomerException("Invalid credentials");
        }

    }
}


class Bank{

    public void initiate() {
        ATM atm = new ATM();

            try {
                atm.input();
                atm.verify();
            } catch (InvalidCustomerException e) {
                System.out.println(e.getMessage());

                try {
                    atm.input();
                    atm.verify();
                }
                catch (InvalidCustomerException e1) {
                    System.out.println(e1.getMessage());
                    try {
                        atm.input();
                        atm.verify();
                    }
                    catch (InvalidCustomerException e2) {
                        System.out.println("Maximum retries reached. Please contact customer support.");
                    }

                }
            }

    }
}




public class LaunchCustom1 {

    public static void main(String[] args) {
        System.out.println("app started");
        Bank b = new Bank();
        b.initiate();
        System.out.println("app terminated");
    }
}
