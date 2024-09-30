package Sprint1.Uppgift3;

import java.util.ArrayList;

public class Course {

    private String name;
    private Teacher teacher;

    public Course(String name) {
        this.name = name;
    }

    public void removeTeacher(){
        this.teacher = null;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
