package StudentService;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iUserService<Employee> {
    private int counter;
    private List<Employee> employees;

    public EmployeeService() {
        this.counter = 0;
        this.employees = new ArrayList<Employee>();
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    @Override
    public List<Employee> getAllUsers() {
        return null;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Employee employee = new Employee(firstName, lastName, age, counter++);
        this.employees.add(employee);
    }

    public List<Employee> getSortedByFIOEmployee(){
        List<Employee> employeesSorted  = new ArrayList<Employee>(employees);
        employeesSorted.sort(new UserComparator<Employee>());
        return employeesSorted;


    }
}
