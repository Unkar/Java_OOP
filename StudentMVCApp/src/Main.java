import Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Model.Model;
import View.View;
import Controller.Controller;
import Controller.iGetView;
import Controller.iGetModel;
import Model.FileRepo;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
//        Student s1 = new Student("Ivan", "Ivanov", 20,1);
//        Student s2 = new Student("Petr", "Petrov", 21,2);
//        Student s3 = new Student("Sergey", "Sergeev", 22,3);
//        Student s4 = new Student("Ivan", "Ivanov", 20,4);
//        Student s5 = new Student("Petr", "Petrov", 21,5);
//        students = Arrays.asList(s1, s2, s3, s4, s5);

//        FileRepo toModelFileRepo = new FileRepo("studentsDb.txt");
//        for(Student student:students){
//            toModelFileRepo.addStudent(student);
//        }
//        toModelFileRepo.saveAllStudentsToFile();


        iGetModel model = new Model(students);
        iGetModel modelFileRepo = new FileRepo("studentsDb.txt");
        iGetView view = new View();
        Controller controller = new Controller(view, modelFileRepo);
        controller.run();
    }
}