class TeluskoAI {

    static int age;
    static {
        age = 11;
        System.out.println("Static block of telusko");
    }

    static void disp(){
        System.out.println("Age is "+age);
    }



}





public class LaunchStatic4 {
    static void main(String[] args) {
        TeluskoAI.disp();
    }
}
