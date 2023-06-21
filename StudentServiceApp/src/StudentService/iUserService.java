package StudentService;

import StudentDomen.User;

import java.util.List;

public interface iUserService <T extends User> {
    List<T> getAllUsers();
    void create(String firstName, String lastName, int age);


}

