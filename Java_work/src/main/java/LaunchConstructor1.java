class Telusko1 {
    private String name;
    private double cost;

    Telusko1(){
        System.out.println("Zero param Constructor");
    }

    Telusko1(String name, double cost){
        System.out.println("Param Constructor");
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}




public class LaunchConstructor1 {
    public static void main(String[] args) {
        Telusko1 t1 = new Telusko1("Java", 10000.5);
        Telusko1 t2 = new Telusko1();

        System.out.println(t1.getName());
        System.out.println(t1.getCost());
    }
}
