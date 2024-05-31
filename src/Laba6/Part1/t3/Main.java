package Laba6.Part1.t3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Олександр", "HR", 5500.00);
        Employee emp2 = new Employee("Іван", "IT", 32000.00);
        Employee emp3 = new Employee("Марія", "Marketing", 42000.00);
        Employee emp4 = new Employee("Оксана", "Sales", 12000.00);

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        EmployeePrinter employeePrinter = new EmployeePrinter(employees);
        employeePrinter.printEmployeeDetails(employees);

    }
}