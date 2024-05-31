package Laba6.Part1.t2;

import java.util.List;

public class Company {
    private List<Employee> employees;
    private double getSalary;

    public Company(List<Employee> employees, double getSalary) {
        this.employees = employees;
        this.getSalary = getSalary;
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + getSalary);
        }
    }
}