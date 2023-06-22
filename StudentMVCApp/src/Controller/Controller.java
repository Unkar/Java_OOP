package Controller;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }


    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    public void updateView() {
        //MVC
        //view.printAllStudents(model.getAllStudents());
        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("No data");
        }
    }

    public void run() {
        Commands com;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.promt("Enter command");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("EXIT");
                    break;
                case LIST:
                    updateView();
                    break;
            }

        }
    }
}
