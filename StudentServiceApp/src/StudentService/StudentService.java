package StudentService;
import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student> {
    private int counter;
    private List<Student> students;

    public StudentService() {
        this.counter = 0;
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAllUsers() {
        return this.students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age, counter++);
        this.students.add(student);
    }
}
