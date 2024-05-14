package Laba5.UserListProcessor;

import java.util.List;

public class UserCounter {
    private List<String> usernames;

    public UserCounter(List<String> usernames) {
        this.usernames = usernames;
    }

    public int countAdmins() {
        int adminCount = 0;
        for (String username : usernames) {
            if (isUserAdmin(username)) {
                adminCount++;
            }
        }
        return adminCount;
    }

    private boolean isUserAdmin(String username) {
        return username.contains("admin");
    }
}
