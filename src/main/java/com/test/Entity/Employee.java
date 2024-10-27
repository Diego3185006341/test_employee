package com.test.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Employee {

    private Long id;
    private String name;
    private double employee_salary;
    private Integer age;
    private String profile_image;
    private double annual_salary;


}
