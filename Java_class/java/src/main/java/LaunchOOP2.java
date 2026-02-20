class Dog{
    int cost;
    String name;
    void bark(){
        int age = 4;

        System.out.println("Dog barks");
        age =6;
        System.out.println(age);
        System.out.println(name);
    }

    void run(){
        System.out.println("Dog is running");
    }
}

public class LaunchOOP2 {
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        dg1.bark();
        dg1.run();

        Dog dg2 = new Dog();
        dg2.bark();
        dg2.run();
    }
}
