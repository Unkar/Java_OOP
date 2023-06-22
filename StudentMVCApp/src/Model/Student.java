package Model;

import org.jetbrains.annotations.NotNull;

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
        return "\nStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", idStudent=" + idStudent +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if(super.getAge() == o.getAge()){
            return 0;
        }
        if(super.getAge() > o.getAge()){
            return 1;
        }
        return -1;
    }
}