
public class Student<T,V,S extends Comparable<S>> extends User implements Comparable<Student<T,V,S>> {
    private S idStudent;

    public Student(T firstName, T lastName, V age, S idStudent) {
        super(firstName, lastName, age);
        this.idStudent = idStudent;
    }

    public S getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(S idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idStudent=" + idStudent +
                '}';
    }

    @Override
    public int compareTo(Student<T,V,S> o) {
        return this.idStudent.compareTo(o.idStudent);
    }
}