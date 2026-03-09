interface Telusko3 {

    // if interface has methods with body, then they are default methods. default keyword should be used
    default void course() {
        System.out.println("Telusko learning");
        ai();
        sd();
    }


    // static methods are not inherited in implementation classes. can be invoked in deafult methods in the class
    static void ai() {
        System.out.println("ai static method of interface");
    }

    // private methods are not inherited in implementation classes. can be invoked in deafult methods in the class
    private void sd() {
        System.out.println("system design course");
    }


}



class AI implements Telusko3 {

    // default methods are inherited in implementation classes and can be overridden
//    public void course() {
//        System.out.println("Telusko learning 2");
//    }

}




public class LaunchInterface2 {
    static void main(String[] args) {

        Telusko3 a = new AI();

        a.course();

    }
}
