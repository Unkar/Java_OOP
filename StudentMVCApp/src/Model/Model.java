package Model;

import Controller.iGetModel;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;


    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
