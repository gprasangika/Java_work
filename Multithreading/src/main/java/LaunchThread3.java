import java.util.Scanner;

class Alpha1 implements Runnable{


    public void registration() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id:");

        int id = sc.nextInt();

        System.out.println("Enter your age:");

        int age = sc.nextInt();

        System.out.println("id " + id + " age " + age);

    }

    @Override
    public void run() {
        registration();
    }
}

class Beta1 implements Runnable {

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

    @Override
    public void run() {
        courseInfo();
    }
}

class Gamma1 implements Runnable{
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

    @Override
    public void run() {
        printingStars();
    }
}



public class LaunchThread3 {
    static void main(String[] args) {

        System.out.println("Main thread started");
        Alpha1 alpha = new Alpha1();
        Beta1 beta = new Beta1();
        Gamma1 gamma = new Gamma1();

        Thread t1 = new Thread(alpha);  // creating threads with object ref for task
        Thread t2 = new Thread(beta);
        Thread t3 = new Thread(gamma);

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());

        t1.start();     // giving life to thread
        t2.start();
        t3.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());

        System.out.println("Main thread ended");
        // these 3 activities are not related to each other. but holding at one place while it could proceed another activity is a waste of resources. Here the reason for the issue is we only have single thread.
        // So the solution is to use multiple threads
//        alpha.registration();
//        beta.courseInfo();
//        gamma.printingStars();
    }
}

// implement Runnable interface is recommended over extending Thread class as it provides better flexibility to implement more interfaces and extend a class and avoids issues with single inheritance in Java.