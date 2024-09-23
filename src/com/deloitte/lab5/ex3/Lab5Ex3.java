package com.deloitte.lab5.ex3;

import com.deloitte.lab5.ex3.com.cg.eis.exception.EmployeeException;
import java.util.Scanner;

public class Lab5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        int salary = scanner.nextInt();

        Employee employee = new Employee(salary);

        try {
            if (employee.getSalary() < 3000) {
                throw new EmployeeException("Salary cannot be below 3000");
            }
            System.out.println("Employee salary is valid");
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}