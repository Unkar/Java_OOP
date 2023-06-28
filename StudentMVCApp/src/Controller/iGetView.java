package Controller;

import Model.Student;

import java.util.HashMap;

public interface iGetView {
    void printAllStudents(HashMap<Long, Student> students);

    String promt(String message);
}
