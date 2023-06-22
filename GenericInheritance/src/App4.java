import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App4 {
    public static void main(String[] args) {
        Student<String,Integer,Long> s1 = new Student<String,Integer,Long>("Ivan", "Ivanov", 18, (long)101);
        System.out.println(s1);
        Student<String,Integer,Long> s2 = new Student<String,Integer,Long>("Ivan1", "Ivanov1", 23, (long)102);
        Student<String,Integer,Long> s3 = new Student<String,Integer,Long>("Ivan2", "Ivanov2", 27, (long)103);

        List<Student<String,Integer,Long>> students = Arrays.asList(s1, s2, s3);

        StudentGroup<String,Integer,Long> studentGroup = new StudentGroup<String,Integer,Long>((long) 1, students);
        for(Student<String,Integer,Long> student : studentGroup){
            System.out.println(student);
        }

    }
}