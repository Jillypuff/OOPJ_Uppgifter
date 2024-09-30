package Sprint1.Uppgift3;

import java.util.ArrayList;

public class Teacher extends Person{
    private final ArrayList<Course> courseTeacher;

    public Teacher(String name, int age, ArrayList<Course> courseTeacher){
        super(name, age);
        this.courseTeacher = courseTeacher;
    }

    public void addCourse(Course course){
        this.courseTeacher.add(course);
    }

    public void removeCourse(Course course){
        this.courseTeacher.remove(course);
    }
}
