package homework.functional.intarfaces;

import java.util.Arrays;
import java.util.List;

public class TestUsersProvider {

    public static List<User> createTestUsers() {
        User user1 = new User(23, "Anthony", 67, true, "Software consultant");
        User user2 = new User(41, "Liam", 87, true, "Soldier");
        User user3 = new User(18, "Stephanie", 46, false, "Model");
        User user4 = new User(25, "Vlad", 98, true, "Musician");
        User user5 = new User(29, "Sammy", 87, true, "Factory worker");
        User user6 = new User(37, "Elen", 65, false, "Editor");
        User user7 = new User(21, "Carla", 73, false, "Waiter");
        User user8 = new User(44, "Bobby", 76, true, "Politician");
        User user9 = new User(52, "Vikki", 51, false, "Scientist");
        User user10 = new User(32, "Agata", 55, false, "Astrologer");
        User user11 = new User(29, "Frida", 60, false, "Shop assistant");
        User user12 = new User(31, "Nikolas", 80, true, "Teacher");
        User user13 = new User(19, "Dillan", 91, true, "Computer engineer");
        User user14 = new User(61, "Cooper", 81, true, "Park-keeper");
        User user15 = new User(56, "Iris", 70, false, "Psychiatrist");

        return Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9,
                user10, user11, user12, user13, user14, user15);
    }
}
