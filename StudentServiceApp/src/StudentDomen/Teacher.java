package StudentDomen;

public class Teacher extends User {
    private int idTeacher;
    private String graduate;

    public Teacher(String firstName, String lastName, int age, int idTeacher, String graduate) {
        super(firstName, lastName, age);
        this.idTeacher = idTeacher;
        this.graduate = graduate;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
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
                ", subject='" + graduate + '\'' +
                '}';
    }
}
