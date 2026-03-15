package main;

import service.DevOps;
import service.SystemDesign;

public class LaunchSpring {

    public static void main(String[] args) {
//        SystemDesign sd = new SystemDesign();

        // constructor injection - injecting dependent object to target object via constructor
        Telusko t = new Telusko(new DevOps()); //target object

        // setter injection -  injecting dependent object to target object via setter
//        t.setCourse(new SystemDesign());  //new SystemDesign() dependent object.
        boolean status = t.buyTheCourse();

        if(status) {
            System.out.println("Successfully registered at Telusko");
        }
        else {
            System.out.println("Registration failed");
        }
    }
}
