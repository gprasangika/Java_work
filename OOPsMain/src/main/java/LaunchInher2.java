class Parent {

    // inherited method to child
    void sleep() {
        System.out.println("Sleeps lot");
    }

    void dressingStyle() {
        System.out.println("dresses based on their time");
    }



}

class Child extends Parent {

    // overridden method
    void dressingStyle() {
        System.out.println("dresses based on our modern time");
    }

    // specialized method
    void habit() {
        System.out.println("child swims well");
    }
}



public class LaunchInher2 {
    static void main(String[] args) {
        Parent ref = new Child();
        ref.sleep();
        ref.dressingStyle();
        ((Child) ref).habit(); // downcasting
    }
}
