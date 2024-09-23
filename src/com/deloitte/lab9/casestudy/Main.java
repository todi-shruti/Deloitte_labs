package com.deloitte.lab9.casestudy;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Lab9Casestudy lab9Casestudy = new Lab9Casestudy(new EmployeeRepository());

        // 1. Find out the sum of salary of all employees.
        System.out.println("Sum of salaries: " + lab9Casestudy.sumOfSalaries());

        // 2. List out department names and count of employees in each department.
        Map<String, Long> departmentEmployeeCount = lab9Casestudy.departmentEmployeeCount();
        System.out.println("Department employee count: " + departmentEmployeeCount);

        // 3. Find out the senior most employee of an organization.
        Employee seniorMostEmployee = lab9Casestudy.seniorMostEmployee();
        System.out.println("Senior most employee: " + seniorMostEmployee.getFirstName() + " " + seniorMostEmployee.getLastName());

        // 4. List employee name and duration of their service in months and days.
        List<String> employeeServiceDuration = lab9Casestudy.employeeServiceDuration();
        System.out.println("Employee service duration: " + employeeServiceDuration);

        // 5. Find out department without employees.
        List<String> departmentsWithoutEmployees = lab9Casestudy.departmentsWithoutEmployees();
        System.out.println("Departments without employees: " + departmentsWithoutEmployees);

        // 6. Find departments with highest count of employees.
        List<String> departmentsWithHighestEmployeeCount = lab9Casestudy.departmentsWithHighestEmployeeCount();
        System.out.println("Departments with highest employee count: " + departmentsWithHighestEmployeeCount);

        // 7. List employee name, hire date and day of week on which employee has started.
        List<String> employeeHireDateAndDay = lab9Casestudy.employeeHireDateAndDay();
        System.out.println("Employee hire date and day: " + employeeHireDateAndDay);

        // 8. List employee name, hire date and day of week for employee started on Friday.
        List<String> employeesStartedOnFriday = lab9Casestudy.employeesStartedOnFriday();
        System.out.println("Employees started on Friday: " + employeesStartedOnFriday);

        // 9. List employee’s names and name of manager to whom he/she reports.
        List<String> employeeManagerReport = lab9Casestudy.employeeManagerReport();
        System.out .println("Employee manager report: " + employeeManagerReport);

        // 10. List employee name, salary and salary increased by 15%.
        List<String> employeeSalaryIncrease = lab9Casestudy.employeeSalaryIncrease();
        System.out.println("Employee salary increase: " + employeeSalaryIncrease);

    }
}