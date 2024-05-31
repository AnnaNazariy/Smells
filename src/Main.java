import Laba5.LargeClass.EnemyList;
import Laba5.LargeClass.FriendList;
import Laba5.LargeClass.Person;
import Laba5.LargeClass.TaskList;
import Laba5.Older.ItemPreparer;
import Laba5.Older.Order;
import Laba5.Older.PaymentProcessor;
import Laba5.UserListProcessor.User;
import Laba5.UserListProcessor.UserCounter;
import Laba5.UserListProcessor.UserListProcessor2;
import Laba6.Part1.t1.Account;
import Laba6.Part1.t1.Bank;
import Laba6.Part1.t2.Company;
import Laba6.Part1.t2.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //LargeClass
        System.out.println("LargeClass");
        Person person = new Person("Alice", 30, "Female");

        FriendList friendList = new FriendList(new ArrayList<>());
        friendList.addFriend("Bob");
        friendList.addFriend("Charlie");
        person.setFriends(friendList.getFriends());

        EnemyList enemyList = new EnemyList(new ArrayList<>());
        enemyList.addEnemy("Eve");
        person.setEnemies(enemyList.getEnemies());

        TaskList taskList = new TaskList(new ArrayList<>());
        taskList.addTask("Complete project");
        person.setTasks(taskList.getTasks());

        System.out.println("Person Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Friends: " + person.getFriends());
        System.out.println("Enemies: " + person.getEnemies());
        System.out.println("Tasks: " + person.getTasks());
        System.out.println("---------------------------------------------------------");

        //Order
        System.out.println("Order");
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");
        Order order = new Order("John Doe", items);
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment();

        ItemPreparer itemPreparer = new ItemPreparer();
        itemPreparer.prepareItems(items);

        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("---------------------------------------------------------");

        // UserListProcessor
        System.out.println("UserListProcessor");
        List<String> usernames = new ArrayList<>();
        usernames.add("john_admin");
        usernames.add("jane_doe");
        usernames.add("admin_007");
        UserCounter userCounter = new UserCounter(usernames);
        int adminCount = userCounter.countAdmins();
        System.out.println("Number of admin users: " + adminCount);
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("admin2");
        userList.add("user3");

        UserListProcessor2 userListProcessor = new UserListProcessor2(userList);
        userListProcessor.processUserList();

        User user = new User("new_user", "new_user@example.com");
        userListProcessor.addUser(user);
        userListProcessor.sendEmailToUser(user);
        System.out.println("---------------------------------------------------------");

        System.out.println("Laba6");
        System.out.println("Part1");
        System.out.println("task1");
        Account acc1 = new Account(150000.00, 2.50);
        Account acc2 = new Account(250000.00, 3.75);


        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);

        Bank bank = new Bank(accounts);
        bank.processAccounts();
        System.out.println("---------------------------------------------------------");


        System.out.println("task2");
        Employee emp1 = new Employee("Олександр");
        Employee emp2 = new Employee("Іван");
        Employee emp3 = new Employee("Марія");
        Employee emp4 = new Employee("Оксана");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        Company company = new Company(employees, 250.00);
        company.printEmployeeSalaries();
        System.out.println("---------------------------------------------------------");


        System.out.println("task4");


        System.out.println("---------------------------------------------------------");

    }
}
