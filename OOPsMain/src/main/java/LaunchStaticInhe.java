class Animal1 {

     static int age;

     static final float pi = 3.14f;

     static void disp() {
         System.out.println("Parent class static method");
     }

}


class Deer extends Animal1 {

    static void disp() {
        System.out.println("Deer class static method");
    }

//    public void show() {
//        age= 15;
//    }

}




public class LaunchStaticInhe {

    public static void main(String[] args) {
        Deer d = new Deer();
//        d.show();
//        System.out.println(Deer.age);
        d.disp();
//        ((Deer)d).show();
//        System.out.println(Deer.age);
    }
}


// Static variables and methods are inherited.
// Inherited static methods can't be overridden. when overriding, inherited method will be hidden and the new method will be a specialized method. this is called method hiding. Specialized method dominates.