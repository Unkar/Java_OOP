package StudentService;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup>  studentGroups;
    public StudentGroupService() {
        this.studentGroups = new ArrayList<StudentGroup>();
    }

    public List<StudentGroup> getStudentGroups(){
        return this.studentGroups;
    }
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)    {
        List<Student> students = new ArrayList<Student>(studentGroups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
