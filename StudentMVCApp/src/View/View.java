package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements iGetView {
    public void printAllStudents(List<Student> students) {
        System.out.println("--------All students--------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------------------");
    }

    @Override
    public String promt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
