package com.deloitte.lab9.casestudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab9Casestudy {
    private EmployeeRepository employeeRepository;

    public Lab9Casestudy(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public double sumOfSalaries() {
        return employeeRepository.getEmployees().stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    public Map<String, Long> departmentEmployeeCount() {
        return employeeRepository.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
    }

    public Employee seniorMostEmployee() {
        return employeeRepository.getEmployees().stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
                .orElse(null);
    }

    public List<String> employeeServiceDuration() {
        return employeeRepository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + ChronoUnit.MONTHS.between(e.getHireDate (), LocalDate.now()) + " months, " + ChronoUnit.DAYS.between(e.getHireDate(), LocalDate.now()) % 30 + " days")
                .collect(Collectors.toList());
    }


    public List<String> departmentsWithoutEmployees() {
        List<String> departments = employeeRepository.getEmployees().stream()
                .map(Employee::getDepartmentName)
                .distinct()
                .collect(Collectors.toList());
        return departments.stream()
                .filter(d -> employeeRepository.getEmployees().stream()
                        .noneMatch(e -> e.getDepartmentName().equals(d)))
                .collect(Collectors.toList());
    }

    public List<String> departmentsWithHighestEmployeeCount() {
        Map<String, Long> departmentEmployeeCount = departmentEmployeeCount();
        long maxCount = departmentEmployeeCount.values().stream()
                .max(Long::compare)
                .orElse(0L);
        return departmentEmployeeCount.entrySet().stream()
                .filter(e -> e.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> employeeHireDateAndDay() {
        return employeeRepository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getHireDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " - " + e.getHireDate().getDayOfWeek())
                .collect(Collectors.toList());
    }

    public List<String> employeesStartedOnFriday() {
        return employeeRepository.getEmployees().stream()
                .filter(e -> e.getHireDate().getDayOfWeek().toString().equals("FRIDAY"))
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getHireDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " - " + e.getHireDate().getDayOfWeek())
                .collect(Collectors.toList());
    }

    public List<String> employeeManagerReport() {
        return employeeRepository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " reports to " + getManagerName(e.getManagerId()))
                .collect(Collectors.toList());
    }

    public List<String> employeeSalaryIncrease() {
        return employeeRepository.getEmployees().stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getSalary() + " - " + (e.getSalary() * 1.15))
                .collect(Collectors.toList());
    }



    private String getManagerName(Integer managerId) {
        Employee manager = employeeRepository.getEmployees().stream()
                .filter(e -> e.getId() == managerId)
                .findFirst()
                .orElse(null);
        if (manager != null) {
            return manager.getFirstName() + " " + manager.getLastName();
        } else {
            return "No Manager";
        }
    }
}