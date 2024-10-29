package org.example.exercises.ex2;

import java.util.List;
import java.util.Map;

/*
Exercise 2: Collections - Employee Management System
Objective: Practice using Collections, specifically List, Map, and Set.

Create an Employee class with fields like id, name, department, and salary.

Implement a Company class with:

A List<Employee> to store employees.
Methods to add, remove, and update employees.
A Map<String, List<Employee>> to group employees by department.
Write a method to find all employees with a salary above a certain threshold.
 */
public class Main {
    public static void main(String[] args) {
        Company company = setupCompany();

        Map<String, List<Employee>> employeeMap = company.groupByDepartment();
        for (Map.Entry<String, List<Employee>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey().toUpperCase());

            List<Employee> employeeList = entry.getValue();

            for (Employee employee : employeeList) {
                System.out.println(" - " + employee);
            }
        }

        System.out.println("-------------------");
        System.out.println("Employees with salary above 2000");
        List<Employee> employeeList = company.getAllEmployeeWithSalaryAbove(2000);

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }


    }

    private static Company setupCompany() {
        Employee employee1 = new Employee(1, "John", "it", 1000);
        Employee employee2 = new Employee(2, "Mike", "it", 1500);
        Employee employee3 = new Employee(3, "Dan", "it", 2200);
        Employee employee4 = new Employee(4, "Mara", "hr", 1700);
        Employee employee5 = new Employee(5, "Ioana", "sales", 900);
        Employee employee6 = new Employee(6, "Daniela", "hr", 3800);
        Employee employee7 = new Employee(7, "Mihaela", "sales", 1020);
        Employee employee8 = new Employee(8, "George", "sales", 1450);
        Employee employee9 = new Employee(9, "Vasile", "it", 4000);

        Company company = new Company();

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);
        company.addEmployee(employee7);
        company.addEmployee(employee8);
        company.addEmployee(employee9);

        return company;
    }
}
