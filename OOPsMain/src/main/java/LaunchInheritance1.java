class Alpha {

    void show() {

        System.out.println("Telusko has both live and recorded course");
    }
}

class Beta extends Alpha {

    void disp() {
        System.out.println("This is Live Java SpringBoot classes");
    }
}









public class LaunchInheritance1 {
    static void main(String[] args) {
        Beta b = new Beta();

        b.disp();
        b.show();
    }
}
