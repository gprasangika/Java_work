class Employee2 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LaunchEncap4 {
    static void main(String[] args) {
        Employee2 emp1 = new Employee2();
        emp1.setId(1234);
        System.out.println(emp1.getId());

        emp1.setName("John");
        System.out.println(emp1.getName());

        Employee2 emp2 = new Employee2();
        emp2.setId(5678);
        System.out.println(emp2.getId());

        emp2.setName("James");
        System.out.println(emp2.getName());

    }
}
