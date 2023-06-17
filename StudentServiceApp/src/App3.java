import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

import java.util.*;

public class App3 {
    public static void main(String[] args) {
        Student student1 = new Student("Name1", "Surname1", 23, 1);
        Student student2 = new Student("Name2", "Surname2", 24, 2);
        Student student3 = new Student("Name3", "Surname3", 24, 3);
        Student student4 = new Student("Name4", "Surname4", 26, 4);
        Student student5 = new Student("Name5", "Surname5", 21, 5);
        Student student6 = new Student("Name6", "Surname6", 23, 6);
        Student student7 = new Student("Name7", "Surname7", 21, 7);
        Student student8 = new Student("Name8", "Surname8", 23, 8);
        Student student9 = new Student("Name9", "Surname9", 21, 9);
        Student student10 = new Student("Name10", "Surname10", 22, 10);
        Student student11 = new Student("Name11", "Surname11", 25, 11);
        Student student12 = new Student("Name12", "Surname12", 23, 12);
        Student student13 = new Student("Name13", "Surname13", 22, 13);
        Student student14 = new Student("Name14", "Surname14", 23, 14);
        Student student15 = new Student("Name15", "Surname15", 22, 15);

        StudentGroup studentGroup1 = new StudentGroup(1, Arrays.asList(student1, student2, student3, student4, student5, student6));
        StudentGroup studentGroup2 = new StudentGroup(2, Arrays.asList(student7, student8, student9));
        StudentGroup studentGroup3 = new StudentGroup(3, Arrays.asList(student10, student11, student12, student13));
        StudentGroup studentGroup4 = new StudentGroup(4, Arrays.asList(student14, student15));

        StudentSteam studentSteam = new StudentSteam(1, Arrays.asList(studentGroup1, studentGroup2, studentGroup3, studentGroup4));

        for(StudentGroup group: studentSteam){
            System.out.println(group);
        }
        System.out.println("----------------");
        Collections.sort(studentSteam.getStudentGroups());

        for(StudentGroup group: studentSteam){
            Collections.sort(group.getStudents());
            System.out.println(group);
        }





    }
}