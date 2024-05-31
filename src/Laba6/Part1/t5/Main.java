package Laba6.Part1.t5;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Employee();
        manager.setName("Яна");

        Department department = new Department();
        department.setManager(manager);

        Employee employee = new Employee();
        employee.setDepartment(department);

        System.out.println("Manager's name: " + employee.getManagerName());
    }
}