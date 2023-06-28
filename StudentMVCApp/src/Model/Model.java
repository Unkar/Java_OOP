package Model;

import Controller.iGetModel;

import java.util.HashMap;

public class Model implements iGetModel {
    private HashMap<Long, Student> students;


    public Model(HashMap<Long, Student> students) {
        this.students = students;
    }

    public HashMap<Long,Student> getAllStudents(){
        return students;
    }

    public boolean checkIsStudentID(String studentID){
        return students.containsKey(Long.parseLong(studentID));
    }

    public void deleteStudent(String studentID){
        students.remove(Long.parseLong(studentID));
    }


}
