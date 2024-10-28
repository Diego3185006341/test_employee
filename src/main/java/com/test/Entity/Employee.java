package com.test.Entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Employee extends Person{

    private double employee_salary;
    private String profile_image;
    private double annual_salary;
    public Employee(Long id, String name, Integer age, double employee_salary, String profile_image, double annual_salary) {
        super(id, name, age); // Call the constructor of the superclass (Person)
        this.employee_salary = employee_salary;
        this.profile_image = profile_image;
        this.annual_salary = annual_salary;
    }

    }
