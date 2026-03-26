class TeluskoAI {

    private int id;
    private String course;

    public void courses()
    {
        id = 4;
        course = "Java";
        System.out.println("Telusko AI");
    }

    @Override
    public String toString() {
        return "TeluskoAI [id=" + id + ", course=" + course + "]";
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }
}





public class LaunchToString {
    public static void main(String[] args) {


        TeluskoAI t = new TeluskoAI();


        System.out.println(t);
        t.courses();

        System.out.println(t);

    }
}
