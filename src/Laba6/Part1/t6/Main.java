package Laba6.Part1.t6;

public class Main {
    public static void main(String[] args) {

        Department department = new Department("Engineering");

        Employee manager = new Employee("Максим");
        department.setManager(manager);

        Employee employee = new Employee("Мар'ян");
        employee.setDepartment(department);

        String managerName = employee.getDepartment().getManagerName();
        System.out.println("Manager name: " + managerName);
    }
}