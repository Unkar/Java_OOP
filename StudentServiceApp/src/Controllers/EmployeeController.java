package Controllers;

import StudentDomen.Employee;
import StudentDomen.User;
import StudentService.EmployeeService;

public class EmployeeController implements iUserController<Employee> {
    private final EmployeeService employeeService = new EmployeeService();

    @Override
    public void create(String firstName, String lastName, int age) {
        employeeService.create(firstName, lastName, age);
    }

    public <T extends Employee> void paySalary(T person){
        System.out.println(((User) person).getFirstName() + "зп заплачено");
    }

    static public <T extends Number> double mean(T[] num){
        double sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i].doubleValue();
        }
        sum /= num.length;
        return sum;
    }


}
