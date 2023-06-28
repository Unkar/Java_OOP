import Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import Model.Model;
//import View.View;
import View.ViewEng;
import Controller.Controller;
import Controller.iGetView;
import Controller.iGetModel;
import Model.FileRepo;

public class Main {
    public static void main(String[] args) {
        HashMap<Long, Student> students = new HashMap<Long, Student>();
        Student s1 = new Student("Ivan", "Ivanov", 20,1);
        Student s2 = new Student("Petr", "Petrov", 21,2);
        Student s3 = new Student("Sergey", "Sergeev", 22,3);
        Student s4 = new Student("Ivan", "Ivanov", 20,4);
        Student s5 = new Student("Petr", "Petrov", 21,5);
        students.put((long) s1.getIdStudent(), s1);
        students.put((long) s2.getIdStudent(), s2);
        students.put((long) s3.getIdStudent(), s3);
        students.put((long) s4.getIdStudent(), s4);
        students.put((long) s5.getIdStudent(), s5);


        FileRepo toModelFileRepo = new FileRepo("studentsDb.txt");
        for(Student student : students.values()){
            toModelFileRepo.addStudent(student);
        }
        toModelFileRepo.saveAllStudentsToFile();


        iGetModel model = new Model(students);
        iGetModel modelFileRepo = new FileRepo("studentsDb.txt");
//        iGetView view = new View();
        iGetView view = new ViewEng();
        Controller controller = new Controller(view, model);
        controller.run();
    }
}