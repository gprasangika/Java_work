public class LaunchMutable2 {
    public static void main(String[] args) {


//        StringBuffer sb1 = new StringBuffer("telusko");
//        StringBuffer sb2 = new StringBuffer("telusko");
//
//        System.out.println(sb1 == sb2);

        StringBuilder sb1 = new StringBuilder("telusko");
        StringBuilder sb2 = new StringBuilder("telusko");

        System.out.println(sb1.equals(sb2));    // object class equals() method to compre refs has not been overridden in StringBuilder/StringBuffer class. So compares refs

        System.out.println(sb1.reverse());
    }
}
