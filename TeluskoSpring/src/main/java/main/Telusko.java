package main;


import service.DevOps;
import service.ICourse;

public class Telusko {

    private ICourse course;

    public Telusko(ICourse course) {
        this.course = course;
    }
    public Telusko() {

    }

    public void setCourse(ICourse course) {
        this.course = course;
    }


    public boolean buyTheCourse() {
        return course.registerCourse();
    }

}
