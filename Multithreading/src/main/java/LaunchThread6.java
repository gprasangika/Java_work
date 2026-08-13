class MyCar1 implements Runnable{


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parting lot");
            Thread.sleep(5000);
            synchronized (this){        // synchronized block - locks part of the method to one thread at a time
                System.out.println(Thread.currentThread().getName() + " has entered into car driving seat");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " started to drive car");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " has come back and parked the car");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}





public class LaunchThread6 {
    static void main(String[] args) {

        MyCar1 mc = new MyCar1();

        Thread t1 = new Thread(mc); // new state
        Thread t2 = new Thread(mc);
        Thread t3 = new Thread(mc);

        t1.setName("KID1");
        t2.setName("KID2");
        t3.setName("KID3");

        t1.start();
        t2.start();
        t3.start(); // runnable state
    }
}

// States of a thread
// 1. New
// 2. Runnable
// 3. Running
//    3.1. Sleep - when sleep() method is called when running. will come out of sleep state to runnable state when sleep time is over
//    3.2. Blocked - when required resource is not available. will come out of blocked state to runnable state when resource is available
//    3.3. Wait - when wait() method is called when running. comes out of wait state to runnable state when notify() or notifyAll() is called
// 4. Dead - once thread is done