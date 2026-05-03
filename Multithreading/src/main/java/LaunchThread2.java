import java.util.Scanner;

class Alpha extends Thread{


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

class Beta extends Thread {

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

class Gamma extends Thread{
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



public class LaunchThread2 {
    static void main(String[] args) {

        System.out.println("Main thread started");
        Alpha alpha = new Alpha(); // Creates a new thread as the class extends Tread
        Beta beta = new Beta();
        Gamma gamma = new Gamma();

        alpha.start();  // Give life to thread.
        beta.start();
        gamma.start();
        System.out.println("Main thread ended");
        // these 3 activities are not related to each other. but holding at one place while it could proceed another activity is a waste of resources. Here the reason for the issue is we only have single thread.
        // So the solution is to use multiple threads
//        alpha.registration();
//        beta.courseInfo();
//        gamma.printingStars();
    }
}


// once a thread is created, should give life to it. should have defined what to be executed in run() for each class.

// 2 ways 2 create threads.
// 1. creating Thread object