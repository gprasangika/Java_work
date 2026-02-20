class Employee {

   private int age;
   private String name;

   //setter
   void setAge(int x){
       age = x;
   }

   //getter
   int getAge(){
       return age;
   }


}

public class LaunchEncap {
    static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAge(25);
//        emp.name = "John";
        System.out.println(emp.getAge());
//        System.out.println(emp.name);
    }
}
