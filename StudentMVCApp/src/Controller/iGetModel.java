package Controller;

import Model.Student;

import java.util.HashMap;

public interface iGetModel {
    public HashMap<Long, Student> getAllStudents();

    public void deleteStudent(String studentId);

    public boolean checkIsStudentID(String studentID);
}
