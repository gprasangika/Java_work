class TeluskoMain {

}

class TeluskoAI extends TeluskoMain {


}


class Animal {

    public void eat(int age) {
        System.out.println("Animal is eating and age is "+age);
    }

    public int age() {
        return 8;
    }

    public TeluskoMain animalLearn() {
        TeluskoMain t = new TeluskoMain();
        return t;
    }

}

class Tiger extends Animal {

    public void eat() {
        System.out.println("Tiger hunts and eat");
    }

    public int age() {
        return 10;
    }

    public TeluskoAI animalLearn() {
        TeluskoAI t = new TeluskoAI();
        return t;
    }
}



public class LaunchInheritance4 {
    public static void main(String[] args) {

        Tiger t = new Tiger();

        t.eat(6);

        t.age();



    }
}

//when overridding methods
//
//        (1) should not reduce the visibility of the overridden method in child class
//        (2) should not change return type of the overridden method in child class
//        (3) can change the return type of the overridden method in child class, only if child class method return type is co-variant of parent class method return type. co varient means child of parent.
//        (4) can't change type parameters for the overridden method in child class

//polymorphism
//
//        (1) should have a reference of parent class
//        (2) should have method overridden
//
//        abstract - class, method (not constructor)
//
//    abstract means yet to be completed. abstract methods have no body. If class ha abstract methods, then class should be abstract. Can't instantiate from abstract classes.
