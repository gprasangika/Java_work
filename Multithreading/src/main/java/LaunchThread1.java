public class LaunchThread1 {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Thread started its work");

        Thread th = Thread.currentThread();

        System.out.println(th.getName());
        System.out.println(th.getPriority());
//        Thread.sleep(6000);

        th.setName("Telusko");

        th.setPriority(4);

        System.out.println(th.getName());
        System.out.println(th.getPriority());

        System.out.println("Thread completed its work");
    }
}


// Every thread has a priority, from 1 to 10

// To create a thread, a Thread object needs to be created

// To ways to create threads
// 1. extending Thread class
// 2. implementing Runnable interface