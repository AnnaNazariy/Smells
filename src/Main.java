import Laba5.LargeClass;
import Laba5.Order;
import Laba5.UserListProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example usage of UserListProcessor
        System.out.println("UserListProcessor: ");
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("john_admin");
        usernames.add("jane_doe");
        usernames.add("admin_007");


        UserListProcessor userListProcessor = new UserListProcessor(usernames);
        userListProcessor.processUserList();
        int adminCount = userListProcessor.countAdminUsers();
        System.out.println("Number of admin users: " + adminCount);
        System.out.println("------------------------------------");

        // Example usage of Order
        System.out.println("Order: ");
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");

        Order order = new Order("John Doe", items);
        order.processOrder();
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("------------------------------------");

        // Example usage of LargeClass
        System.out.println("LargeClass");
        LargeClass person = new LargeClass("Alice", 30, "Female");
        person.addFriend("Bob");
        person.addFriend("Charlie");
        person.addEnemy("Eve");
        person.addTask("Complete project");

        person.displayInfo();
        System.out.println("-------------------------------------");

    }
}
