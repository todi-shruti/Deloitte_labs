package com.deloitte.lab9.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Shruti", "Todi", 40000, LocalDate.of(2010, 1, 1), 1, "Engineer", 1));
        employees.add(new Employee(2, "Sonu", "Rao", 12000, LocalDate.of(2012, 2, 2), 2, "Marketing", 1));
        employees.add(new Employee(3, "Monu", "Smith", 15000, LocalDate.of(2015, 3, 3), 3, "IT", 2));
        employees.add(new Employee(4, "Tonu", "Sharma", 1000, LocalDate.of(2017, 4, 4), 4, "Engineer", 1));

    }

    public List<Employee> getEmployees() {
        return employees;
    }
}