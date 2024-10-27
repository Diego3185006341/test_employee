package MockFactory;


import com.test.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class MockFactory {

    public static List<Employee> listEmployeeMock(){
        Employee employee = Employee.builder().name("Carlos").employee_salary(3534).age(34).build();
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        return employees;
    }
    public static Employee EmployeeMock(){

        return Employee.builder().id(123L)
                .age(23)
                .name("Carlos")
                .employee_salary(3456)
                .build();
    }

}
