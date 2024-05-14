package Laba5.UserListProcessor;

import java.util.ArrayList;
import java.util.List;

public class UserListProcessor2 {
    private List<String> usernames;

    public UserListProcessor2(List<String> usernames) {
        this.usernames = usernames;
    }

    // Довгий метод був розділений на більш короткі та зрозуміліші
    public void processUserList() {
        for (String username : usernames) {
            processUser(username);
        }
    }

    private void processUser(String username) {
        System.out.println("Processing user: " + username);
        if (isUserAdmin(username)) {
            System.out.println("Admin user detected!");
        }

    }

    private boolean isUserAdmin(String username) {
        return username.contains("admin");
    }

    // Використання об'єкта для підрахунку адміністраторів
    public int countAdminUsers() {
        UserCounter userCounter = new UserCounter(usernames);
        return userCounter.countAdmins();
    }

    // Метод addUser було відокремлено, використовуючи об'єкт користувача
    public void addUser(User user) {
        // Додавання користувача...
    }

    // Data Clumps було усунено, використовуючи об'єкт користувача
    public void sendEmailToUser(User user) {
        // Відправлення email...
    }
}
