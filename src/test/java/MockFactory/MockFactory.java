package MockFactory;


import com.test.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class MockFactory {

    public static List<Employee> listEmployeeMock(){
        Employee employee = Employee.builder().employee_name("Carlos").employee_salary(3534).employee_age(34).build();
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        return employees;
    }
    public static Employee EmployeeMock(){

        return Employee.builder().id(123L)
                .employee_age(23)
                .employee_name("Carlos")
                .employee_salary(3456)
                .build();
    }

}
