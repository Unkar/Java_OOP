package View;

import Controller.iGetView;
import Model.Student;

import java.util.HashMap;
import java.util.Scanner;

public class ViewEng implements iGetView {
    public void printAllStudents(HashMap<Long, Student> students) {
        System.out.println("--------All students--------");
        for (Student student : students.values()) {
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
