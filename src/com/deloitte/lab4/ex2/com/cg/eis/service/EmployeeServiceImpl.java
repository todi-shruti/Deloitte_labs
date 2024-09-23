package com.deloitte.lab4.ex2.com.cg.eis.service;


import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void getEmployeeDetailsFromUser() {
    }

    @Override
    public void findInsuranceSchemeForEmployee(Employee employee) {
        if (employee.getSalary() > 50000 && employee.getDesignation().equals("Manager")) {
            employee.setInsuranceScheme("Premium");
        } else if (employee.getSalary() > 30000 && employee.getDesignation().equals("Team Lead")) {
            employee.setInsuranceScheme("Standard");
        } else {
            employee.setInsuranceScheme("Basic");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Designation: " + employee.getDesignation());
        System.out.println("Employee Insurance Scheme: " + employee.getInsuranceScheme());
    }
}

