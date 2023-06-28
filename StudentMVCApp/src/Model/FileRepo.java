package Model;

import Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileRepo implements iGetModel {
    private String fileName;
    private HashMap<Long, Student> students;

    public FileRepo(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.students = new HashMap<Long, Student>();
    }

    public void addStudent(Student student) {
        this.students.put((long) student.getIdStudent(), student);
    }

    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                this.students.put((long) pers.getIdStudent(),pers);
                line = reader.readLine();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentsToFile() {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            for (Student student : students.values()) {
                fw.write(String.format("%s %s %d %d\n", student.getFirstName(), student.getLastName(), student.getAge(), student.getIdStudent()));
            }
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HashMap<Long,Student> getAllStudents() {
        readAllStudentsFromFile();
        return students;
    }

    @Override
    public void deleteStudent(String studentId) {
        deleteStudent(studentId);
    }

    @Override
    public boolean checkIsStudentID(String studentID) {
        return students.containsKey(Long.parseLong(studentID));
    }


}
