package StudentDomen;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private Integer idGroup;
    private List<Student> students;

    public StudentGroup(Integer idGroup, List<Student> students) {
        this.idGroup = idGroup;
        this.students = students;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(students);
//    }
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(counter++);
            }
        };
    }


    @Override
    public int compareTo(@NotNull StudentGroup o) {
        if(this.getStudents().size() == o.getStudents().size()){
            return 0;
        }
        if(this.getStudents().size() > o.getStudents().size()){
            return 1;
        }
        return -1;
    }
    @Override
    public String toString(){
        return "StudentGroup{" +
                "idGroup=" + idGroup +
                ", students=" + students +
                '}';
    }
}
