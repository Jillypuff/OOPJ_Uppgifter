package Sprint1.Uppgift3;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public Main(){
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);
        Student charlie = new Student("Charlie", 21);
        Student diana = new Student("Diana", 23);
        Student eve = new Student("Eve", 19);

        Course mathematics = new Course("Mathematics");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");

        List<Participation> participants = new LinkedList<>();
        participants.add(new Participation(alice, mathematics));
        participants.add(new Participation(bob, physics));
        participants.add(new Participation(charlie, chemistry));
        participants.add(new Participation(diana, mathematics));
        participants.add(new Participation(eve, physics));

        participants.add(new Participation(alice, physics));
        participants.add(new Participation(bob, mathematics));
        participants.add(new Participation(charlie, physics));
        participants.add(new Participation(diana, physics));
        participants.add(new Participation(eve, chemistry));

        printStudentsCourses(alice, participants);
        printStudentsCourses(bob, participants);
        printStudentsCourses(charlie, participants);
        printStudentsCourses(diana, participants);
        printStudentsCourses(eve, participants);

    }

    public void printStudentsCourses(Student student, List<Participation> participants){
        String prompt = student.getName() + ":\t\t";
        for (Participation participation : participants){
            if (participation.student() == student){
                prompt += participation.course() + ",";
            }
        }
        prompt = prompt.substring(0, prompt.length() - 1);
        System.out.println(prompt);
    }

    public static void main(String[] args) {
        Main _ = new Main();
    }
}
