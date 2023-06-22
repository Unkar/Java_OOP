
import java.util.Iterator;
import java.util.List;


public class StudentGroup<T,V,S extends Comparable<S>> implements Iterable<Student<T,V,S>>, Comparable<StudentGroup<T,V,S>> {
    private S idGroup;
    private List<Student<T,V,S>> students;

    public StudentGroup(S idGroup, List<Student<T,V,S>> students) {
        this.idGroup = idGroup;
        this.students = students;
    }

    public S getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(S idGroup) {
        this.idGroup = idGroup;
    }

    public List<Student<T,V,S>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T,V,S>> students) {
        this.students = students;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */

    @Override
    public Iterator<Student<T,V,S>> iterator() {
        return new Iterator<Student<T,V,S>>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < students.size();
            }

            @Override
            public Student<T,V,S> next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(counter++);
            }
        };
    }


    @Override
    public int compareTo(StudentGroup<T,V,S> o) {
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
