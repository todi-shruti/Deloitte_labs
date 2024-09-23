package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;

public class Lab4Ex2 {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new Employee(1, "Shruti Todi", 60000, "Enginner");

        employeeService.getEmployeeDetailsFromUser(); 
        employeeService.findInsuranceSchemeForEmployee(employee);
        employeeService.displayEmployeeDetails(employee);
    }
}


