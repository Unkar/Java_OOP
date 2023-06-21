package StudentService;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    int counter;
    String graduate;
    List<Teacher> teachers;

    public TeacherService() {
        this.counter = 0;
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAllUsers() {
        return this.teachers;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher teacher = new Teacher(firstName, lastName, age, counter++, null);
        this.teachers.add(teacher);
    }

    public void create(String firstName, String lastName, int age, String graduate){
        Teacher teacher = new Teacher(firstName, lastName, age, counter++, graduate);
        this.teachers.add(teacher);
    }

    public List<Teacher> getSortedByFIOTeachers(List<Teacher> teachers){
        List<Teacher> sortedTeachers = new ArrayList<Teacher>(teachers);
        sortedTeachers.sort(new UserComparator<Teacher>());
        return  sortedTeachers;

    }
}
