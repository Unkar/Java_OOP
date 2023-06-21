package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

import java.util.List;

public class TeacherController implements iUserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, String lastName, int age) {
        teacherService.create(firstName, lastName, age);
    }

    public void create(String firstName, String lastName, int age, String graduate){
        teacherService.create(firstName, lastName, age, graduate);
    }
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllUsers();
    }

    public List<Teacher> getSortedByFIOTeachers(List<Teacher> teachers){
        return teacherService.getSortedByFIOTeachers(teachers);

    }
}
