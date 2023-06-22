package Model;


public class Student extends User implements Comparable<Student> {
    private int idStudent;

    public Student(String firstName, String lastName, int age, int idStudent) {
        super(firstName, lastName, age);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d", idStudent, firstName, lastName, age);
    }

    @Override
    public int compareTo(Student o) {
        if(super.getAge() == o.getAge()){
            return 0;
        }
        if(super.getAge() > o.getAge()){
            return 1;
        }
        return -1;
    }
}