package StudentDomen;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private Integer idSteam;
    private List<StudentGroup> studentGroups;

    public StudentSteam(Integer idSteam, List<StudentGroup> studentGroups) {
        this.idSteam = idSteam;
        this.studentGroups = studentGroups;
    }

    public Integer getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @NotNull
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext()){
                    return null;
                }
                return studentGroups.get(counter++);
            }
        };
    }
}
