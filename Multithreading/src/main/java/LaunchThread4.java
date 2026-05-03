import java.util.Scanner;

class Telusko implements Runnable{


    @Override
    public void run() {
       String ct = Thread.currentThread().getName();

        if (ct.equals("REG")) {
            registration();
        }
        else if (ct.equals("COURSE")) {
            courseInfo();
        }
        else {
            printingStars();
        }
    }

    public void registration() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id:");

        int id = sc.nextInt();

        System.out.println("Enter your age:");

        int age = sc.nextInt();

        System.out.println("id " + id + " age " + age);

    }

    public void courseInfo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Visit telusko.com for more courses");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void printingStars() {

        for (int i = 0; i < 5; i++) {
            System.out.println("* ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}

// multiple threads can be managed with single run()





public class LaunchThread4 {
    static void main(String[] args) {
        System.out.println("Main Thread started");

        Telusko tl = new Telusko();

        Thread t1 = new Thread(tl);
        Thread t2 = new Thread(tl);
        Thread t3 = new Thread(tl);

        t1.setName("REG");
        t2.setName("COURSE");
        t3.setName("STAR");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread completed its task");
    }
}
