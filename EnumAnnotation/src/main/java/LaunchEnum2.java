enum Result {               // A Class called Result will be created behind the scenes
    PASS, FAIL, NR;         // This many objects of the class will be created

//    public static final Result PASS = new Result();
//    public static final Result FAIL = new Result();
//    public static final Result NR = new Result();

    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Result() {
        System.out.println("Constructor of enum");
    }
//    enum Week1 {
//        MON, TUE;         // inner enum
//    }
}





public class LaunchEnum2 {
    static void main(String[] args) {


        Result res = Result.PASS;

        res.setMarks(85);

        System.out.println(res.getMarks());

    }
}
