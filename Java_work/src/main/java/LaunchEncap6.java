class Telusko {
    private String course;
    private double price;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class LaunchEncap6 {
    static void main(String[] args) {
        Telusko t1 = new Telusko();
        t1.setCourse("DevOps");
        t1.setPrice(6000.5);

        System.out.println(t1.getCourse());
        System.out.println(t1.getPrice());

    }
}
