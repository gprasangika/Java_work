class Alien {

    private int id;
    private String name;

    void setId(int i) {
        id = i;
    }

    void setName(String n) {
        name = n;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}




public class LaunchEncap3 {
    static void main(String[] args) {
        Alien al = new Alien();
        al.setId(25555);

        System.out.println(al.getId());

        al.setName("John");
        System.out.println(al.getName());
    }
}
