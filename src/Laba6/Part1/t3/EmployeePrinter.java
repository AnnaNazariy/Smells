package Laba6.Part1.t3;

import java.util.List;

public class EmployeePrinter {
    private List<Employee> employees;

    public EmployeePrinter(List<Employee> employees) {
        this.employees = employees;
    }

    public void printEmployeeDetails(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary() + "\n");
        }
    }
}