package homework.functional.intarfaces;

import java.util.ArrayList;
import java.util.List;

public class FiltrationHelper {

    public List<User> FiltrateUsersByConditions(List<User> userList, FilterUsers filterUsers) {
        List<User> usersThatMatchConditions = new ArrayList<>();
        for (User user : userList) {
            if (filterUsers.checkCondition(user)) {
                usersThatMatchConditions.add(user);
            }
        }
        return usersThatMatchConditions;
    }
}
