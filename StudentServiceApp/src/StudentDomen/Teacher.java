package StudentDomen;

public class Teacher extends User {
    private int idTeacher;
    private String subject;

    public Teacher(String firstName, String lastName, int age, int idTeacher, String subject) {
        super(firstName, lastName, age);
        this.idTeacher = idTeacher;
        this.subject = subject;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idTeacher=" + idTeacher +
                ", subject='" + subject + '\'' +
                '}';
    }
}
