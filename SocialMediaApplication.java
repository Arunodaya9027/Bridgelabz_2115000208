import java.util.ArrayList;
import java.util.List;

class SocialMedia {
    private User head;
    
    private class User {
        int userId;
        String name;
        int age;
        List<Integer> friendIds;
        User next;

        public User(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
            this.next = null;
        }

        public void addFriend(int friendId) {
            if (!friendIds.contains(friendId)) {
                friendIds.add(friendId);
            }
        }

        public void removeFriend(int friendId) {
            friendIds.remove(Integer.valueOf(friendId));
        }

        public void displayFriends() {
            System.out.println(name + "'s Friends: " + friendIds);
        }
    }

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } 
        else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User " + name + " added.");
    }

    private User findUser(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);

        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
            System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);

        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
            System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void displayFriends(int userId) {
        User user = findUser(userId);
        if (user != null) {
            user.displayFriends();
        } else {
            System.out.println("User not found.");
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>();
            for (int id : user1.friendIds) {
                if (user2.friendIds.contains(id)) {
                    mutualFriends.add(id);
                }
            }
            System.out.println("Mutual friends of " + user1.name + " and " + user2.name + ": " + mutualFriends);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void searchUser(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + ", Age: " + temp.age + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    public void countFriends(int userId) {
        User user = findUser(userId);
        if (user != null) {
            System.out.println(user.name + " has " + user.friendIds.size() + " friends.");
        } else {
            System.out.println("User not found.");
        }
    }
}

public class SocialMediaApplication {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        socialMedia.addUser(1, "Amit Kumar", 25);
        socialMedia.addUser(2, "Arun", 23);
        socialMedia.addUser(3, "Karan Seangar", 27);

        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);
        socialMedia.displayFriends(1);

        socialMedia.findMutualFriends(2, 3);
        socialMedia.searchUser("Arun");
        socialMedia.countFriends(1);

        socialMedia.removeFriendConnection(1, 3);
        socialMedia.displayFriends(1);
    }
}