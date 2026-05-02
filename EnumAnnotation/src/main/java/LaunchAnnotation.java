//ParentClass
class Animal {

    public  void animalUsuallyhuntsAndEats() {
        System.out.println("Animal is eating.....");
    }
}

//ChildClass
class Tiger extends Animal {

    //override
    @Override
    public void animalUsuallyhuntsAndEats() {
        System.out.println("Tiger fearlessly hunts and eats");
    }
}


public class LaunchAnnotation {
    static void main(String[] args) {


        Animal a = new Tiger();

        a.animalUsuallyhuntsAndEats();
    }
}

// annotation are meta data about code