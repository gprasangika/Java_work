class Add {


    int add(int a, int b) {
        try {
            System.out.println("Adding 2 numbers");
            return a + b;
        }
        finally {
            System.out.println("Operation completed");
        } // statements in finally block will execute after return.

    }

}






public class LaunchBeta {
    static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(5, 6));
    }
}
