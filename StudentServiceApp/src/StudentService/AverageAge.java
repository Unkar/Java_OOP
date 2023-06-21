package StudentService;

import StudentDomen.User;

import java.util.Collection;

public class AverageAge<T extends User> {
    private Collection<T> users;

    public AverageAge(Collection<T> users) {
        this.users = users;
    }

    public double getAverageAge(){
        double sum = 0;
        for (T user : users) {
            sum += user.getAge();
        }
        return sum/users.size();
    }

    @Override
    public String toString(){
        return "Average age: " + getAverageAge();
    }
}
