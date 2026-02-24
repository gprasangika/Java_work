class Car {

    private String brand;
    private double cost;

    static int count;

    {
        count++;
    }

    Car() {
    }

    Car(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    Car (String brand) {
        this.brand = brand;
    }

}


public class LaunchJavaBlock {
    static void main(String[] args) {
        Car c1 = new Car("BMW", 100000);
        System.out.println(Car.count);

        Car c2 = new Car("Audi");
        System.out.println(Car.count);

        Car c3 = new Car();
        System.out.println(Car.count);

        Car c4 = new Car();
        System.out.println(Car.count);
    }
}
