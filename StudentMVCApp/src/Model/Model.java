package Model;

import java.util.List;

public class Model {
    private List<Student> students;


    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
