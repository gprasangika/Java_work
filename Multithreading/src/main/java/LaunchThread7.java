class Library implements Runnable {

    String java = new String("JAVA");
    String devOps = new String("DEVOPS");
    String aws = new String("AWS");


    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        if (name.equals("KAPIL")) {
            try {
                System.out.println("KAPIL got into library");
                Thread.sleep(5000);
                synchronized(java) {
                    System.out.println("KAPIL has acquired Java book");
                    Thread.sleep(5000);
                    synchronized(devOps) {
                        System.out.println("KAPIL has acquired DevOps book");
                        Thread.sleep(5000);
                        synchronized(aws) {
                            System.out.println("KAPIL has acquired AWS book");
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                System.out.println("KARAN got into library");
                Thread.sleep(5000);
                synchronized(aws) {
                    System.out.println("KARAN has acquired AWS book");
                    Thread.sleep(5000);
                    synchronized(devOps) {
                        System.out.println("KARAN has acquired DevOps book");
                        Thread.sleep(5000);
                        synchronized(java) {
                            System.out.println("KARAN has acquired JAVA book");
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }




}




// when 2 threads are stuck permanently due to mutual dependency - dead lock
// using synchronized carefully to avoid deadlocks






public class LaunchThread7 {
    static void main(String[] args) {

        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("KAPIL");
        t2.setName("KARAN");

        t1.start();
        t2.start();
    }
}
