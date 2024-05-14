package Laba5.LargeClass;

import java.util.List;

public class FriendList {
    private List<String> friends;

    public FriendList(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }
}

