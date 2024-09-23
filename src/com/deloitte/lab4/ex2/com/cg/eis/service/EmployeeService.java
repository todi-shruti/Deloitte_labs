package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetailsFromUser();
    void findInsuranceSchemeForEmployee(Employee employee);
    void displayEmployeeDetails(Employee employee);
}

