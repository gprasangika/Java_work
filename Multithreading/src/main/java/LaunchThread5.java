class MyCar implements Runnable{


    @Override
    synchronized public void run() { // synchronized means only one thread can operate at a time. locks run() for one thread. when sharing same run() among multiple threads, and need to focus one thread at a time
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parting lot");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " has entered into car driving seat");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " started to drive car");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " has come back and parked the car");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}





public class LaunchThread5 {
    static void main(String[] args) {

        MyCar mc = new MyCar();

        Thread t1 = new Thread(mc);
        Thread t2 = new Thread(mc);
        Thread t3 = new Thread(mc);

        t1.setName("KID1");
        t2.setName("KID2");
        t3.setName("KID3");

        t1.start();
        t2.start();
        t3.start();
    }
}


// StringBuffer - methods are synchronized. multiple threads cant run them at a time
// StringBuilder - methods are not synchronized. multiple threads can run them at a time