package org.example.exercises.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employeeList;

    public Company() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmployee(int employeeId) {
        this.employeeList = this.employeeList.stream()
                .filter((employee) -> employee.getId() != employeeId)
                .toList();
    }

    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        removeEmployee(oldEmployee.getId());

        addEmployee(newEmployee);
    }

    public Map<String, List<Employee>> groupByDepartment() {
        // init map
        Map<String, List<Employee>> employeeMap = new HashMap<>();

        // iterate employee
        for (Employee employee : this.employeeList) {
            String department = employee.getDepartment();

            List<Employee> employees;

            if (employeeMap.containsKey(department)) {
                employees = employeeMap.get(department);
            } else {
                employees = new ArrayList<>();
            }

            employees.add(employee);

            employeeMap.put(department, employees);
        }

        return employeeMap;
    }

    List<Employee> getAllEmployeeWithSalaryAbove(int salary) {
        return this.employeeList.stream()
                .filter((employee) -> employee.getSalary() >= salary)
                .toList();
    }
}
